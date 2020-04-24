package tv.twitch.android.mod.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import tv.twitch.android.mod.utils.Logger;

public class PrefManager {
    private static final String PREF_KEY_EMOTES = "MOD_EMOTES";
    private static final String PREF_KEY_DISABLE_GIFS = "MOD_DISABLE_GIFS2";
    private static final String PREF_KEY_SHOW_DEL_MESSAGES = "MOD_SHOW_DEL_MESSAGES";
    private static final String PREF_KEY_EMOTE_PICKER = "MOD_EMOTE_PICKER";
    private static final String PREF_KEY_POINTS = "MOD_POINTS";
    private static final String PREF_KEY_TIMESTAMPS = "MOD_TIMESTAMPS";
    private static final String PREF_KEY_EXOPLAYER = "MOD_EXOPLAYER";
    private static final String PREF_KEY_COPY_MSG = "MOD_COPY_MSG";
    private static final String PREF_KEY_DISABLE_PLAYER_AUTOPLAY = "MOD_DISABLE_AUTOPLAY";
    private static final String PREF_KEY_DISABLE_RECENT_SEARCH = "MOD_DISABLE_RECENT_SEARCH";
    private static final String PREF_KEY_FIX_BRIGHTNESS  = "MOD_FIX_BRIGHTNESS";
    private static final String PREF_KEY_EXOPLAYER_SPEED_LIST  = "MOD_EXOPLAYER_SPEED2";
    private static final String PREF_KEY_MINIPLAYER_SIZE  = "MOD_MINIPLAYER_SIZE";
    private static final String PREF_KEY_EMOTE_SIZE = "MOD_EMOTE_SIZE2";
    private static final String PREF_KEY_VIDEO_DEBUG = "MOD_VIDEO_DEBUG";
    private static final String PREF_KEY_TWITCH_DARK_THEME_ENABLED = "dark_theme_enabled";

    private static final String PREF_KEY_DISABLE_RECOMMENDATIONS = "MOD_DISABLE_RECOMMENDATIONS";
    private static final String PREF_KEY_DISABLE_FOLLOWED_GAMES = "MOD_DISABLE_FOLLOWED_GAMES";
    private static final String PREF_KEY_DISABLE_RECENT_WATCHING = "MOD_DISABLE_RESUME_WATCHING";

    private SharedPreferences mPref;

    public PrefManager(Context context) {
        mPref = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public SharedPreferences getSharedPreferences() {
        return mPref;
    }

    public boolean isKeyExists(String key) {
        return mPref.contains(key);
    }

    private boolean getBoolean(String key, boolean def) {
        if (mPref == null) {
            Logger.warning("mPref is null");
            return def;
        }

        return mPref.getBoolean(key, def);
    }

    private String getString(String key, String def) {
        if (mPref == null) {
            Logger.warning("mPref is null");
            return def;
        }

        return mPref.getString(key, def);
    }

    public boolean isEmotesOn() {
        return getBoolean(PREF_KEY_EMOTES, true);
    }

    public boolean isDisableGifs() {
        return getBoolean(PREF_KEY_DISABLE_GIFS, true);
    }

    public boolean isPreventMsg() {
        return getBoolean(PREF_KEY_SHOW_DEL_MESSAGES, false);
    }

    public boolean isHookEmoticonSetOn() {
        return getBoolean(PREF_KEY_EMOTE_PICKER, true);
    }

    public boolean isClickerOn() {
        return getBoolean(PREF_KEY_POINTS, false);
    }

    public boolean isTimestampsOn() {
        return getBoolean(PREF_KEY_TIMESTAMPS, false);
    }

    public boolean isExoPlayerOn() {
        return getBoolean(PREF_KEY_EXOPLAYER, false);
    }

    public boolean isCopyMsgOn() {
        return getBoolean(PREF_KEY_COPY_MSG, false);
    }

    public boolean isDisableAutoplay() {
        return getBoolean(PREF_KEY_DISABLE_PLAYER_AUTOPLAY, false);
    }

    public boolean isShowVideoDebugPanel() {
        return getBoolean(PREF_KEY_VIDEO_DEBUG, false);
    }

    public boolean isDisableRecentSearch() {
        return getBoolean(PREF_KEY_DISABLE_RECENT_SEARCH, false);
    }

    public boolean isDisableRecentWatching() {
        return getBoolean(PREF_KEY_DISABLE_RECENT_WATCHING, false);
    }

    public boolean isDisableRecommendations() {
        return getBoolean(PREF_KEY_DISABLE_RECOMMENDATIONS, false);
    }

    public boolean isDisableFollowedGames() {
        return getBoolean(PREF_KEY_DISABLE_FOLLOWED_GAMES, false);
    }

    public boolean isDarkTheme() {
        return getBoolean(PREF_KEY_TWITCH_DARK_THEME_ENABLED, false);
    }

    public boolean isFixBrightness() {
        return getBoolean(PREF_KEY_FIX_BRIGHTNESS, true);
    }

    public float getExoplayerSpeed() {
        return Float.parseFloat(getString(PREF_KEY_EXOPLAYER_SPEED_LIST, "1.0"));
    }

    public float getMiniplayerSize() {
        return Float.parseFloat(getString(PREF_KEY_MINIPLAYER_SIZE, "1.0"));
    }

    public String getEmoteSize() {
        return getString(PREF_KEY_EMOTE_SIZE, "MEDIUM");
    }
}
