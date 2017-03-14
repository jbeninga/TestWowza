package live.fantag.wowza;

import com.wowza.wms.amf.AMFPacket;
import com.wowza.wms.logging.WMSLoggerFactory;
import com.wowza.wms.media.model.MediaCodecInfoAudio;
import com.wowza.wms.media.model.MediaCodecInfoVideo;
import com.wowza.wms.stream.IMediaStream;
import com.wowza.wms.stream.IMediaStreamNotify;
import com.wowza.wms.stream.IMediaStreamActionNotify3;

public class MyMediaStreamListener implements IMediaStreamNotify, IMediaStreamActionNotify3
{

	@Override
	public void onMediaStreamCreate(IMediaStream stream)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onMediaStreamCreate: " + stream.getSrc());
	}

	@Override
	public void onMediaStreamDestroy(IMediaStream stream)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onMediaStreamDestroy: " + stream.getSrc());
	}

	@Override
	public void onMetaData(IMediaStream stream, AMFPacket metaDataPacket)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onMetaData: " + stream.getName());
	}

	@Override
	public void onPauseRaw(IMediaStream stream, boolean isPause, double location)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onPauseRaw: " + stream.getName());
	}

	@Override
	public void onPlay(IMediaStream stream, String streamName, double playStart, double playLen, int playReset)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onPlay: " + stream.getName());
	}

	@Override
	public void onPublish(IMediaStream stream, String streamName, boolean isRecord, boolean isAppend)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onPublish: " + stream.getName());
	}

	@Override
	public void onUnPublish(IMediaStream stream, String streamName, boolean isRecord, boolean isAppend)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onUnPublish: " + stream.getName());
	}

	@Override
	public void onPause(IMediaStream stream, boolean isPause, double location)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onPause: " + stream.getName());
	}

	@Override
	public void onSeek(IMediaStream stream, double location)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onSeek: " + stream.getName());
	}

	@Override
	public void onStop(IMediaStream stream)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onStop: " + stream.getName());
	}

	@Override
	public void onCodecInfoVideo(IMediaStream stream, MediaCodecInfoVideo codecInfoVideo)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onCodecInfoVideo: " + stream.getName());
	}

	@Override
	public void onCodecInfoAudio(IMediaStream stream, MediaCodecInfoAudio codecInfoAudio)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onCodecInfoAudio: " + stream.getName());
	}
	
}
