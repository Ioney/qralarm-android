package com.sweak.qralarm.core.designsystem.icon

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowForwardIos
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.ArrowDropDown
import androidx.compose.material.icons.outlined.ArrowDropUp
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.Done
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.sweak.qralarm.R

object QRAlarmIcons {
    val QRAlarm @Composable get() = ImageVector.vectorResource(R.drawable.ic_qralarm)

    val Add = Icons.Outlined.Add
    val Menu = Icons.Outlined.Menu
    val Close = Icons.Outlined.Close
    val Done = Icons.Outlined.Done
    val ForwardArrow = Icons.AutoMirrored.Outlined.ArrowForwardIos
    val ArrowDropUp = Icons.Outlined.ArrowDropUp
    val ArrowDropDown = Icons.Outlined.ArrowDropDown
    val Play = Icons.Outlined.PlayArrow
}