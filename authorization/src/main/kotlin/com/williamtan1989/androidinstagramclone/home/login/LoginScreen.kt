package com.williamtan1989.androidinstagramclone.home.login

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.williamtan1989.androidinstagramclone.theme.SnapventTheme
import com.williamtan1989.androidinstagramclone.theme.snapventColors
import com.williamtan1989.androidinstagramclone.theme.snapventTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier,
) {
    var username by remember { mutableStateOf(TextFieldValue()) }
    var password by remember { mutableStateOf(TextFieldValue()) }

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(
                        onClick = onNavigateBack,
                    ) {
                        Icon(
                            modifier = Modifier.size(48.dp),
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                            contentDescription = "Go back to previous screen",
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.snapventColors.primaryContainerColor,
                ),
                title = {},
            )
        },
        containerColor = MaterialTheme.snapventColors.primaryContainerColor,
    ) { innerPadding ->
        Box(
            modifier = Modifier.padding(innerPadding)
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 16.dp),
                ) {
                    Column(
                        modifier = Modifier.align(Alignment.Center),
                        verticalArrangement = Arrangement.spacedBy(12.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(
                            modifier = Modifier,
                            text = "Snapvent",
                            style = MaterialTheme.snapventTypography.normal40,
                        )

                        TextField(
                            modifier = Modifier
                                .fillMaxWidth()
                                .border(
                                    width = 1.dp,
                                    color = MaterialTheme.snapventColors.textFieldBorderColor,
                                    shape = RoundedCornerShape(5.dp),
                                ),
                            value = username,
                            onValueChange = { newTextFieldValue ->
                                username = newTextFieldValue
                            },
                            placeholder = {
                                Text(
                                    text = "username or email",
                                    style = MaterialTheme.snapventTypography.bold16,
                                    color = MaterialTheme.snapventColors.placeholderColor,
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = MaterialTheme.snapventColors.textFieldContainerColor,
                                focusedContainerColor = MaterialTheme.snapventColors.textFieldContainerColor,
                                unfocusedIndicatorColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent,
                            ),
                        )

                        TextField(
                            modifier = Modifier
                                .fillMaxWidth()
                                .border(
                                    width = 1.dp,
                                    color = MaterialTheme.snapventColors.textFieldBorderColor,
                                    shape = RoundedCornerShape(5.dp),
                                ),
                            value = password,
                            onValueChange = { newTextFieldValue ->
                                password = newTextFieldValue
                            },
                            placeholder = {
                                Text(
                                    text = "password",
                                    style = MaterialTheme.snapventTypography.bold16,
                                    color = MaterialTheme.snapventColors.placeholderColor,
                                )
                            },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = MaterialTheme.snapventColors.textFieldContainerColor,
                                focusedContainerColor = MaterialTheme.snapventColors.textFieldContainerColor,
                                unfocusedIndicatorColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent,
                            ),
                            visualTransformation = PasswordVisualTransformation(),
                        )

                        TextButton(
                            modifier = Modifier.align(Alignment.End),
                            onClick = {

                            },
                        ) {
                            Text(
                                text = "Forgot password?",
                                style = MaterialTheme.snapventTypography.medium12,
                                color = MaterialTheme.snapventColors.accentColor,
                            )
                        }

                        Button(
                            modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors().copy(
                                containerColor = MaterialTheme.snapventColors.accentColor,
                                disabledContainerColor = MaterialTheme.snapventColors.accentColor.copy(alpha = 0.5f),
                            ),
                            shape = RoundedCornerShape(5.dp),
                            enabled = username.text.isNotBlank() && password.text.isNotBlank(),
                            onClick = {},
                        ) {
                            Text(
                                text = "Log in",
                                style = MaterialTheme.snapventTypography.semibold14,
                                color = Color.White,
                            )
                        }
                    }
                }

                HorizontalDivider()

                Box(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Text(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(16.dp),
                        text = buildAnnotatedString {
                            withStyle(
                                SpanStyle(
                                    color = Color.Gray,
                                )
                            ) {
                                append("Don't have an account? ")
                            }

                            withStyle(
                                SpanStyle(
                                    fontWeight = FontWeight.Bold,
                                )
                            ) {
                                append("Sign up.")
                            }
                        },
                    )
                }
            }
        }
    }
}

@Composable
@Preview
private fun LoginScreenPreview() {
    SnapventTheme {
        LoginScreen(
            onNavigateBack = {},
        )
    }
}