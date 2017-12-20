package csiw.lirecview

import com.facebook.litho.Column
import com.facebook.litho.ComponentContext
import com.facebook.litho.ComponentLayout
import com.facebook.litho.annotations.LayoutSpec
import com.facebook.litho.annotations.OnCreateLayout
import com.facebook.litho.annotations.Prop
import com.facebook.litho.widget.Text
import com.facebook.yoga.YogaEdge

/**
 * Created by Patel Milan on 19/12/17.
 * Email :- patelmilan2692@gmail.com
 */

@LayoutSpec
object ListItemSpec {
    @OnCreateLayout
    internal fun onCreateLayout(
            context: ComponentContext,
            @Prop color: Int,
            @Prop title: String,
            @Prop subTitle: String): ComponentLayout {
        return Column.create(context)
                .paddingDip(YogaEdge.ALL, 16f)
                .backgroundColor(color)
                .child(Text.create(context)
                        .textSizeDip(40f)
                        .text(title)
                        .build())
                .child(Text.create(context)
                        .textSizeDip(20f)
                        .text(subTitle)
                        .build())
                .build()
    }
}
