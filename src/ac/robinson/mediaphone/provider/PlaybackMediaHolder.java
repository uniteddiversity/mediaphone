/*
 *  This file is part of Com-Me.
 * 
 *  Com-Me is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU Lesser General Public License as 
 *  published by the Free Software Foundation; either version 3 of the 
 *  License, or (at your option) any later version.
 *
 *  Com-Me is distributed in the hope that it will be useful, but WITHOUT 
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 *  or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General 
 *  Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with Com-Me.
 *  If not, see <http://www.gnu.org/licenses/>.
 */

package ac.robinson.mediaphone.provider;

public class PlaybackMediaHolder {
	public final String mParentFrameId;
	public final String mMediaPath;
	public final int mMediaType;

	private final int mMediaStartTime;
	private final int mMediaEndTime;

	private final int mPlaybackOffset;

	public PlaybackMediaHolder(String parentId, String mediaPath, int mediaType, int startTime, int endTime,
			int playbackOffset) {
		mParentFrameId = parentId;
		mMediaPath = mediaPath;
		mMediaType = mediaType;
		mMediaStartTime = startTime;
		mMediaEndTime = endTime;
		mPlaybackOffset = playbackOffset;
	}

	public int getStartTime(boolean includePlaybackOffset) {
		return includePlaybackOffset ? mMediaStartTime - mPlaybackOffset : mMediaStartTime;
	}

	public int getEndTime(boolean includePlaybackOffset) {
		return includePlaybackOffset ? mMediaEndTime - mPlaybackOffset : mMediaEndTime;
	}
}
