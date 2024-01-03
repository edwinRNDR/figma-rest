package org.openrndr.figma.rest

import kotlinx.serialization.Serializable

/**
 * Enum describing how layer blends with layers below
 *
 * This type is a string enum with the following possible values
 * Normal blends:
 * PASS_THROUGH (only applicable to objects with children)
 * NORMAL
 *
 * Darken:
 * DARKEN
 * MULTIPLY
 * LINEAR_BURN ("Plus darker" in Figma)
 * COLOR_BURN
 *
 * Lighten:
 * LIGHTEN
 * SCREEN
 * LINEAR_DODGE ("Plus lighter" in Figma)
 * COLOR_DODGE
 *
 * Contrast:
 * OVERLAY
 * SOFT_LIGHT
 * HARD_LIGHT
 *
 * Inversion:
 * DIFFERENCE
 * EXCLUSION
 *
 * Component:
 * HUE
 * SATURATION
 * COLOR
 * LUMINOSITY
 */
typealias BlendMode=String