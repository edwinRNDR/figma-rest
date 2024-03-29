package org.openrndr.figma.rest

import kotlinx.serialization.Serializable

/**
 * Metadata for character formatting
 */
@Serializable
data class TypeStyle(
    val fontFamily: String,
    val fontPostScriptName: String,
    val paragraphSpacing: Double = 0.0,
    val paragraphIndent: Double = 0.0,
    val listSpacing: Double = 0.0,
    val italic: Boolean? = null,
    val fontWeight: Double,
    val fontSize: Double,
    val textCase: String = "ORIGINAL",
    val textDecoration: String = "NONE",
    val textAutoResize: String = "NONE",
    val textTruncation: String = "NONE",
    val maxLines: Double? = null,
    val textAlignHorizontal: String,
    val textAlignVertical: String,
    val letterSpacing: Double,
    val fills: List<Paint> = emptyList(),
    val hyperlink: Hyperlink? = null,
    val openTypeFlags: Map<String, Double> = emptyMap(),
    val lineHeightPx: Double? = null,
    val lineHeightPercent: Double? = null,
    val lineHeightPercentFontSize: Double? = null,
    val lineHeightUnit: String,
)