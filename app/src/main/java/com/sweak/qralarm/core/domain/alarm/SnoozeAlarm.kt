package com.sweak.qralarm.core.domain.alarm

import com.sweak.qralarm.alarm.QRAlarmManager
import java.time.ZonedDateTime
import javax.inject.Inject

class SnoozeAlarm @Inject constructor(
    private val qrAlarmManager: QRAlarmManager,
    private val alarmsRepository: AlarmsRepository
) {
    suspend operator fun invoke(alarmId: Long) {
        val alarm = alarmsRepository.getAlarm(alarmId = alarmId) ?: return
        val snoozeAlarmTimeInMillis = ZonedDateTime.now()
            .withSecond(0)
            .withNano(0)
            .plusMinutes(alarm.snoozeConfig.snoozeMode.snoozeDurationInMinutes.toLong())
            .toInstant()
            .toEpochMilli()

        alarmsRepository.addOrEditAlarm(
            alarm = alarm.copy(
                snoozeConfig = alarm.snoozeConfig.copy(
                    numberOfSnoozesLeft = alarm.snoozeConfig.numberOfSnoozesLeft - 1,
                    isAlarmSnoozed = true,
                    nextSnoozedAlarmTimeInMillis = snoozeAlarmTimeInMillis
                )
            )
        )

        qrAlarmManager.setAlarm(
            alarmId = alarm.alarmId,
            alarmTimeInMillis = snoozeAlarmTimeInMillis,
            isSnoozeAlarm = true
        )
    }
}