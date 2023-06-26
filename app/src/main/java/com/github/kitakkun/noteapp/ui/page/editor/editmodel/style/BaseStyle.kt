package com.github.kitakkun.noteapp.ui.page.editor.editmodel.style

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

enum class BaseStyle(
    val color: Color,
    val fontSize: TextUnit,
    val letterSpacing: TextUnit,
) {
    Title(
        color = Color.Black,
        fontSize = 25.sp,
        letterSpacing = 0.sp,
    ),
    Heading(
        color = Color.Black,
        fontSize = 22.sp,
        letterSpacing = 0.sp,
    ),
    Body(
        color = Color.Black,
        fontSize = 20.sp,
        letterSpacing = 0.5.sp,
    );

    val spanStyle = SpanStyle(
        fontSize = fontSize,
        letterSpacing = letterSpacing
    )

    val paragraphStyle = ParagraphStyle(
        lineHeight = fontSize * 1.5f,
    )
}
