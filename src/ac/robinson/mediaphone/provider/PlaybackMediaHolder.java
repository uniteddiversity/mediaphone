package ac.robinson.mediaphone.provider;

public class PlaybackMediaHolder {
	final public String mParentFrameId;
	final public String mMediaPath;
	final public int mMediaType;
	public int mMediaStartTime;
	public int mMediaDuration;

	public PlaybackMediaHolder(String parentId, String mediaPath, int mediaType, int startTime, int duration) {
		mParentFrameId = parentId;
		mMediaPath = mediaPath;
		mMediaType = mediaType;
		mMediaStartTime = startTime;
		mMediaDuration = duration;
	}
}
