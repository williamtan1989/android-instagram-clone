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
    val normal40: TextStyle
        @Composable
        get() = TextStyle.Default.copy(
            fontSize = 40.sp,
            color = snapventColors.primaryTextColor,
        )

    val bold16: TextStyle
        @Composable
        get() = TextStyle.Default.copy(
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = snapventColors.primaryTextColor,
        )

    val semibold14: TextStyle
        @Composable
        get() = TextStyle.Default.copy(
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            color = snapventColors.primaryTextColor,
        )

    val normal14: TextStyle
        @Composable
        get() = TextStyle.Default.copy(
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = snapventColors.primaryTextColor,
        )

    val medium12: TextStyle
        @Composable
        get() = TextStyle.Default.copy(
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            color = snapventColors.primaryTextColor,
        )
}

val LocalSnapventTypography = staticCompositionLocalOf { SnapventTypography(SnapventColors(), Typography()) }

val MaterialTheme.snapventTypography: SnapventTypography
    @Composable
    @ReadOnlyComposable
    get() = LocalSnapventTypography.current