package com.sweak.qralarm.features.add_edit_alarm

import com.sweak.qralarm.core.domain.alarm.AVAILABLE_GENTLE_WAKE_UP_DURATIONS_IN_SECONDS
import com.sweak.qralarm.core.domain.alarm.AVAILABLE_SNOOZE_DURATIONS_IN_MINUTES
import com.sweak.qralarm.core.domain.alarm.AVAILABLE_SNOOZE_NUMBERS
import com.sweak.qralarm.core.domain.alarm.AlarmRingtone
import com.sweak.qralarm.features.add_edit_alarm.model.AlarmRepeatingScheduleWrapper
import com.sweak.qralarm.features.add_edit_alarm.model.AlarmRingtoneWrapper
import com.sweak.qralarm.features.add_edit_alarm.model.AlarmSnoozeConfigurationWrapper

data class AddEditAlarmScreenState(
    val alarmHourOfDay: Int? = null,
    val alarmMinute: Int? = null,
    val isAlarmEnabled: Boolean = true,
    val alarmRepeatingScheduleWrapper: AlarmRepeatingScheduleWrapper = AlarmRepeatingScheduleWrapper(),
    val isChooseAlarmRepeatingScheduleDialogVisible: Boolean = false,
    val alarmSnoozeConfigurationWrapper: AlarmSnoozeConfigurationWrapper = AlarmSnoozeConfigurationWrapper(),
    val availableSnoozeNumbers: List<Int> = AVAILABLE_SNOOZE_NUMBERS,
    val availableSnoozeDurationsInMinutes: List<Int> = AVAILABLE_SNOOZE_DURATIONS_IN_MINUTES,
    val isChooseAlarmSnoozeConfigurationDialogVisible: Boolean = false,
    val alarmRingtoneWrapper: AlarmRingtoneWrapper = AlarmRingtoneWrapper.OriginalRingtone.GentleGuitar,
    val availableAlarmRingtones: List<AlarmRingtone> = AlarmRingtone.entries,
    val isChooseAlarmRingtoneDialogVisible: Boolean = false,
    val areVibrationsEnabled: Boolean = true,
    val isCodeEnabled: Boolean = true,
    val gentleWakeupDurationInSeconds: Int = 30,
    val availableGentleWakeUpDurationsInSeconds: List<Int> = AVAILABLE_GENTLE_WAKE_UP_DURATIONS_IN_SECONDS,
    val isChooseGentleWakeUpDurationDialogVisible: Boolean = false,
    val isTemporaryMuteEnabled: Boolean = false
)