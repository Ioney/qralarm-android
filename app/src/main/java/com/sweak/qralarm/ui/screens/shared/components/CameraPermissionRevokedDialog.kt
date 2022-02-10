package com.sweak.qralarm.ui.screens.shared.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.res.stringResource
import com.sweak.qralarm.R
import com.sweak.qralarm.ui.screens.home.HomeUiState

@Composable
fun CameraPermissionRevokedDialog(
    uiState: MutableState<HomeUiState>,
    onPositiveClick: () -> Unit,
    onNegativeClick: () -> Unit
) {
    if (uiState.value.showCameraPermissionRevokedDialog) {
        Dialog(
            onDismissRequest = {
                uiState.value = uiState.value.copy(showCameraPermissionRevokedDialog = false)
            },
            onPositiveClick = onPositiveClick,
            onNegativeClick = onNegativeClick,
            title = stringResource(R.string.camera_permission_required_title),
            message = stringResource(R.string.camera_permission_revoked_message),
            positiveButtonText = stringResource(R.string.settings),
            negativeButtonText = stringResource(R.string.later)
        )
    }
}