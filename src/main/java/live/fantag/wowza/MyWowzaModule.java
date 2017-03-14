package live.fantag.wowza;

import com.wowza.wms.application.*;
import com.wowza.wms.amf.*;
import com.wowza.wms.client.*;
import com.wowza.wms.module.*;
import com.wowza.wms.request.*;
import com.wowza.wms.stream.*;
import com.wowza.wms.rtp.model.*;
import com.wowza.wms.httpstreamer.model.*;
import com.wowza.wms.httpstreamer.cupertinostreaming.httpstreamer.*;
import com.wowza.wms.httpstreamer.smoothstreaming.httpstreamer.*;

public class MyWowzaModule extends ModuleBase {

	private IMediaStreamNotify mediaStreamListener = new MyMediaStreamListener();

	public void doSomething(IClient client, RequestFunction function, AMFDataList params) {
		getLogger().info("fantag::doSomething");
		sendResult(client, params, "Hello Wowza");
	}

	public void onAppStart(IApplicationInstance appInstance) {
		String fullname = appInstance.getApplication().getName() + "/" + appInstance.getName();
		getLogger().info("fantag::onAppStart: " + fullname);
		appInstance.addMediaStreamListener(mediaStreamListener);
	}

	public void onAppStop(IApplicationInstance appInstance) {
		String fullname = appInstance.getApplication().getName() + "/" + appInstance.getName();
		getLogger().info("fantag::onAppStop: " + fullname);
		appInstance.removeMediaStreamListener(mediaStreamListener);
	}

	public void onAppCreate(IApplicationInstance appInstance) {
		String fullname = appInstance.getApplication().getName() + "/" + appInstance.getName();
		getLogger().info("fantag::onAppCreate: " + fullname);
	}

	public void onAppDestroy(IApplicationInstance appInstance) {
		String fullname = appInstance.getApplication().getName() + "/" + appInstance.getName();
		getLogger().info("fantag::onAppDestroy: " + fullname);
	}

	public void onConnect(IClient client, RequestFunction function, AMFDataList params) {
		getLogger().info("fantag::onConnect: " + client.getClientId());
	}

	public void onConnectAccept(IClient client) {
		getLogger().info("fantag::onConnectAccept: " + client.getClientId());
	}

	public void onConnectReject(IClient client) {
		getLogger().info("fantag::onConnectReject: " + client.getClientId());
	}

	public void onDisconnect(IClient client) {
		getLogger().info("fantag::onDisconnect: " + client.getClientId());
	}

        public void onStreamCreate(IMediaStream stream)
	{
		getLogger().info("fantag::onStreamCreate: " + stream.getSrc());
	}

	public void onStreamDestroy(IMediaStream stream)
	{
		getLogger().info("fantag::onStreamDestroy: " + stream.getSrc());
	}

}
