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
    val primaryContainerColor: Color = Color.Unspecified,

    val placeholderColor: Color = Color.Unspecified,
    val textFieldContainerColor: Color = Color.Unspecified,
    val textFieldBorderColor: Color = Color.Unspecified,
)

val LightPrimaryTextColor = Color(0xFF000000)
val LightAccentColor = Color(0xFF93C572)
val LightPrimaryContainerColor = Color(0xFFFFFFFF)
val LightPlaceholderColor = Color(0xFFCCCCCC)
val LightTextFieldContainerColor = Color(0xFFF8F8F8)
val LightTextFieldBorderColor = Color(0xFFE5E5E5)

val DarkPrimaryTextColor = Color(0xFFFFFFFF)
val DarkAccentColor = Color(0xFF4A7A3A)
val DarkPrimaryContainerColor = Color(0xFF000000)
val DarkPlaceholderColor = Color(0xFF333333)
val DarkTextFieldContainerColor = Color(0xFF1C1C1C)
val DarkTextFieldBorderColor = Color(0xFF2A2A2A)

val LightSnapventColors = SnapventColors(
    primaryTextColor = LightPrimaryTextColor,
    accentColor = LightAccentColor,
    primaryContainerColor = LightPrimaryContainerColor,
    placeholderColor = LightPlaceholderColor,
    textFieldContainerColor = LightTextFieldContainerColor,
    textFieldBorderColor = LightTextFieldBorderColor,
)

val DarkSnapventColors = SnapventColors(
    primaryTextColor = DarkPrimaryTextColor,
    accentColor = DarkAccentColor,
    primaryContainerColor = DarkPrimaryContainerColor,
    placeholderColor = DarkPlaceholderColor,
    textFieldContainerColor = DarkTextFieldContainerColor,
    textFieldBorderColor = DarkTextFieldBorderColor,
)

val LocalSnapventColors = staticCompositionLocalOf { SnapventColors() }

val MaterialTheme.snapventColors: SnapventColors
    @Composable
    @ReadOnlyComposable
    get() = LocalSnapventColors.current