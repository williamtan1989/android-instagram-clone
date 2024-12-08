package com.williamtan1989.androidinstagramclone.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class SnapventColors(
    val primaryTextColor: Color = Color.Unspecified,
)

val LightPrimaryTextColor = Color(0x00000000)

val DarkPrimaryTextColor = Color(0XFFFFFFFF)

val LightSnapventColors = SnapventColors(
    primaryTextColor = LightPrimaryTextColor,
)

val DarkSnapventColors = SnapventColors(
    primaryTextColor = DarkPrimaryTextColor,
)

val LocalSnapventColors = staticCompositionLocalOf { SnapventColors() }

val MaterialTheme.snapventColors: SnapventColors
    @Composable
    @ReadOnlyComposable
    get() = LocalSnapventColors.current