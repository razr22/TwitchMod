package tv.twitch.a.k.g.n0;

import java.util.List;

import tv.twitch.android.core.adapters.d0;
import tv.twitch.android.core.adapters.t;
import tv.twitch.android.mod.utils.GifHelper;

// Source: ChannelChatAdapter
public class a extends d0 {
    public void a(List<? extends t> list) {
        int size = 0;
        GifHelper.recycleRange(i(), size); // TODO: __INJECT_CALL
    }

    public void b() {
        GifHelper.recycle(i()); // TODO: __INJECT_CALL
    }
}