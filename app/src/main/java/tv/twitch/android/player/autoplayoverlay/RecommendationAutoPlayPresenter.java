package tv.twitch.android.player.autoplayoverlay;


import tv.twitch.android.mod.bridges.Hooks;
import tv.twitch.android.models.Playable;


public class RecommendationAutoPlayPresenter<T extends Playable> {
    public final void prepareRecommendationForCurrentModel(T t) {
        /* ... */

        if (!Hooks.isJumpDisableAutoplay()) // TODO: __JUMP_HOOK
            // ISubscriptionHelper....
            return;
    }
}
