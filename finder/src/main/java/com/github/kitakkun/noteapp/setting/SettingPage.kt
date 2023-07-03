package com.github.kitakkun.noteapp.setting

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalUriHandler
import androidx.navigation.NavController
import com.github.kitakkun.noteapp.navigation.SubPage

@Composable
fun SettingPage(
    viewModel: SettingViewModel,
    navController: NavController,
) {
    val isAutoSaveEnabled = viewModel.isAutoSaveEnabled.collectAsState()
    val uriHandler = LocalUriHandler.current
    SettingView(
        isAutoSaveEnabled = isAutoSaveEnabled.value,
        onChangedAutoSaveEnabled = viewModel::setAutoSaveEnabled,
        onClickOSSLicense = { navController.navigate(SubPage.License.route) },
        onClickDeveloper = {
            uriHandler.openUri("https://twitter.com/kitakkun_pb")
        }
    )
}
