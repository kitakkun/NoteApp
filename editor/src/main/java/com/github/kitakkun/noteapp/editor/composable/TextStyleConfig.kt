package com.github.kitakkun.noteapp.editor.composable

import androidx.compose.ui.graphics.Color
import com.github.kitakkun.noteapp.data.model.BaseStyle

data class TextStyleConfig(
    val baseStyle: BaseStyle = BaseStyle.Body,
    val bold: Boolean = false,
    val italic: Boolean = false,
    val color: Color = Color.Unspecified,
)
