package com.williamtan1989.androidinstagramclone.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.williamtan1989.androidinstagramclone.common.SnapventImage
import com.williamtan1989.androidinstagramclone.theme.SnapventTheme
import com.williamtan1989.androidinstagramclone.theme.snapventColors
import com.williamtan1989.androidinstagramclone.theme.snapventTypography

@Composable
fun AuthorizationHomeScreen(
    onNavigateToLogin: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier,
        containerColor = MaterialTheme.snapventColors.primaryContainerColor,
    ) { innerPadding ->
        Box(
            modifier = Modifier.padding(innerPadding)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
            ) {
                Box(
                    modifier = Modifier.weight(1f),
                ) {
                    Column(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Text(
                            modifier = Modifier,
                            text = "Snapvent",
                            style = MaterialTheme.snapventTypography.normal40,
                        )

                        Spacer(Modifier.height(40.dp))

                        SnapventImage(
                            modifier = Modifier
                                .size(85.dp)
                                .clip(CircleShape),
                            model = "https://picsum.photos/170",
                            placeholder = rememberVectorPainter(Icons.Default.AccountCircle),
                            contentDescription = "Currently logged in user profile picture",
                        )

                        Text(
                            text = "snapvent_0",
                            style = MaterialTheme.snapventTypography.semibold14,
                        )

                        Button(
                            modifier = Modifier
                                .padding(horizontal = 16.dp)
                                .fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors().copy(
                                containerColor = MaterialTheme.snapventColors.accentColor,
                            ),
                            shape = RoundedCornerShape(5.dp),
                            onClick = {},
                        ) {
                            Text(
                                text = "Log in",
                                style = MaterialTheme.snapventTypography.semibold14,
                                color = Color.White,
                            )
                        }

                        Spacer(modifier = Modifier.height(18.dp))

                        TextButton(
                            onClick = onNavigateToLogin,
                        ) {
                            Text(
                                text = "Switch accounts",
                                color = MaterialTheme.snapventColors.accentColor,
                                style = MaterialTheme.snapventTypography.semibold14,
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
private fun AuthorizationHomeScreenPreview() {
    SnapventTheme {
        AuthorizationHomeScreen(
            onNavigateToLogin = {},
        )
    }
}