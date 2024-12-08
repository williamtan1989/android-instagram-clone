package com.williamtan1989.androidinstagramclone.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Immutable
class SnapventTypography(
    defaultTypography: Typography,
) {
    val title40: TextStyle
        @Composable
        get() = TextStyle.Default.copy(
            fontSize = 40.sp,
            color = MaterialTheme.snapventColors.primaryTextColor,
        )
}

private val snapventTypography = SnapventTypography(Typography())

val LocalSnapventTypography = staticCompositionLocalOf { snapventTypography }

val MaterialTheme.snapventTypography: SnapventTypography
    @Composable
    @ReadOnlyComposable
    get() = LocalSnapventTypography.current