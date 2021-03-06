package tv.twitch.android.mod.models;


import android.text.TextUtils;

import androidx.annotation.NonNull;

import java.util.HashMap;

import tv.twitch.android.mod.models.preferences.EmoteSize;


public class FfzEmoteModel implements Emote {
    private final String mCode;
    
    private final String mSmallEmoteUrl;
    private final String mMediumEmoteUrl;
    private final String mLargeEmoteUrl;

    public FfzEmoteModel(String code, HashMap<String, String> urls) {
        this.mCode = code;

        this.mSmallEmoteUrl = getUrl("1x", urls);
        this.mMediumEmoteUrl = getUrl("2x", urls);
        this.mLargeEmoteUrl = getUrl("4x", urls);
    }

    @NonNull
    @Override
    public String getCode() {
        return mCode;
    }

    @Override
    public String getUrl(@EmoteSize int size) {
        switch (size) {
            case EmoteSize.LARGE:
                if (mLargeEmoteUrl != null)
                    return mLargeEmoteUrl;
            default:
            case EmoteSize.MEDIUM:
                if (mMediumEmoteUrl != null)
                    return mMediumEmoteUrl;
            case EmoteSize.SMALL:
                if (mSmallEmoteUrl != null)
                    return mSmallEmoteUrl;
        }

        return "";
    }

    @Override
    public boolean isGif() {
        return false;
    }

    private String getUrl(String size, HashMap<String, String> urls) {
        if (urls.containsKey(size)) {
            String url = urls.get(size);
            if (TextUtils.isEmpty(url))
                return null;

            if (url != null && url.startsWith("//"))
                url = "https:" + url;

            return url;
        }

        return null;
    }

    @Override
    public String toString() {
        return "FfzEmoteModel{" +
                "mCode='" + mCode + '\'' +
                ", mSmallEmoteUrl='" + mSmallEmoteUrl + '\'' +
                ", mMediumEmoteUrl='" + mMediumEmoteUrl + '\'' +
                ", mLargeEmoteUrl='" + mLargeEmoteUrl + '\'' +
                '}';
    }
}
