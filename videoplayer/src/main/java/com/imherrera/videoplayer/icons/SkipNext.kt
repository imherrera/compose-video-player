package com.imherrera.videoplayer.icons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector

internal val Icons.Rounded.SkipNext: ImageVector
    get() {
        if (_skipNext != null) {
            return _skipNext!!
        }
        _skipNext = materialIcon(name = "Rounded.SkipNext") {
            materialPath {
                moveTo(7.58f, 16.89f)
                lineToRelative(5.77f, -4.07f)
                curveToRelative(0.56f, -0.4f, 0.56f, -1.24f, 0.0f, -1.63f)
                lineTo(7.58f, 7.11f)
                curveTo(6.91f, 6.65f, 6.0f, 7.12f, 6.0f, 7.93f)
                verticalLineToRelative(8.14f)
                curveToRelative(0.0f, 0.81f, 0.91f, 1.28f, 1.58f, 0.82f)
                close()
                moveTo(16.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                close()
            }
        }
        return _skipNext!!
    }

private var _skipNext: ImageVector? = null
