package com.github.kitakkun.noteapp.data.model

import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

enum class BaseStyle(
    val fontSize: TextUnit,
    val letterSpacing: TextUnit,
    val fontWeight: FontWeight = FontWeight.Normal,
    val lineHeight: TextUnit = 1.5.em,
    val lineBreak: LineBreak = LineBreak.Simple,
) {
    Title(
        fontSize = 25.sp,
        letterSpacing = 0.sp,
        lineHeight = 25.sp,
        lineBreak = LineBreak.Paragraph,
        fontWeight = FontWeight.ExtraBold,
    ),
    Heading(
        fontSize = 20.sp,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        lineBreak = LineBreak.Paragraph,
        fontWeight = FontWeight.Bold,
    ),
    Body(
        fontSize = 17.sp,
        letterSpacing = 0.5.sp,
        lineHeight = 17.sp,
    );

    val spanStyle = SpanStyle(
        fontSize = fontSize,
        letterSpacing = letterSpacing,
        fontWeight = fontWeight,
    )

    // TODO: LineBreak is not supported yet.
    // in the future, it will be used to change return key behavior.
    val paragraphStyle = ParagraphStyle(
        lineHeight = lineHeight,
        lineBreak = lineBreak,
    )
}
