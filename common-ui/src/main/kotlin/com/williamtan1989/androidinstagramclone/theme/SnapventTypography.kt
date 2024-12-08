package com.williamtan1989.androidinstagramclone.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Immutable
class SnapventTypography(
    private val snapventColors: SnapventColors,
    defaultTypography: Typography,
) {
    val title40: TextStyle
        @Composable
        get() = TextStyle.Default.copy(
            fontSize = 40.sp,
            color = snapventColors.primaryTextColor,
        )

    val bodyBold16: TextStyle
        @Composable
        get() = TextStyle.Default.copy(
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = snapventColors.primaryTextColor,
        )

    val bodySemibold14: TextStyle
        @Composable
        get() = TextStyle.Default.copy(
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            color = snapventColors.primaryTextColor,
        )
}

val LocalSnapventTypography = staticCompositionLocalOf { SnapventTypography(SnapventColors(), Typography()) }

val MaterialTheme.snapventTypography: SnapventTypography
    @Composable
    @ReadOnlyComposable
    get() = LocalSnapventTypography.current