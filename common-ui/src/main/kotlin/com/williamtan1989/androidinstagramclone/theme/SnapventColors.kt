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
    val accentColor: Color = Color.Unspecified,
)

val LightPrimaryTextColor = Color(0xFF000000)
val LightAccentColor = Color(0xFF93C572)

val DarkPrimaryTextColor = Color(0xFFFFFFFF)
val DarkAccentColor = Color(0xFF4A7A3A)

val LightSnapventColors = SnapventColors(
    primaryTextColor = LightPrimaryTextColor,
    accentColor = LightAccentColor,
)

val DarkSnapventColors = SnapventColors(
    primaryTextColor = DarkPrimaryTextColor,
    accentColor = DarkAccentColor,
)

val LocalSnapventColors = staticCompositionLocalOf { SnapventColors() }

val MaterialTheme.snapventColors: SnapventColors
    @Composable
    @ReadOnlyComposable
    get() = LocalSnapventColors.current