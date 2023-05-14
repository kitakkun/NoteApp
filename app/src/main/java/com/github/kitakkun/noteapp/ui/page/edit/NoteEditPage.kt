package com.github.kitakkun.noteapp.ui.page.edit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun NoteEditPage(
    viewModel: NoteEditViewModel,
) {
    val uiState by viewModel.uiState.collectAsState()
    NoteEditView(
        uiState = uiState,
        onContentChange = viewModel::updateRawContent,
        onBoldChange = {},
        onItalicChange = {},
        onBaseTextFormatClick = {},
        onSaveClick = viewModel::saveDocument,
        onNavigateUpClick = viewModel::navigateUp,
    )
}