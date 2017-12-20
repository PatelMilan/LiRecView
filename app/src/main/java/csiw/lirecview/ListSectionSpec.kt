package csiw.lirecview

import android.graphics.Color

import com.facebook.litho.sections.Children
import com.facebook.litho.sections.SectionContext
import com.facebook.litho.sections.annotations.GroupSectionSpec
import com.facebook.litho.sections.annotations.OnCreateChildren
import com.facebook.litho.sections.common.SingleComponentSection

/**
 * Created by Patel Milan on 19/12/17.
 * Email :- patelmilan2692@gmail.com
 */

@GroupSectionSpec
object ListSectionSpec {
    @OnCreateChildren
    internal fun onCreateChildren(compat: SectionContext): Children {
        val builder = Children.create()
        for (i in 0..38) {
            builder.child(SingleComponentSection.create(compat)
                    .key(i.toString())
                    .component(ListItem.create(compat)
                            .color(if (i % 2 == 0) Color.WHITE else Color.LTGRAY)
                            .title(i.toString() + ". Hello, world!")
                            .subTitle("Litho tutorial")
                            .build()))
        }
        return builder.build()
    }
}