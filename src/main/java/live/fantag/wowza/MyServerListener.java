package live.fantag.wowza;

import com.wowza.wms.logging.*;
import com.wowza.wms.server.*;

public class MyServerListener implements IServerNotify2 {

	public void onServerConfigLoaded(IServer server) {
		WMSLoggerFactory.getLogger(null).info("fantag::onServerConfigLoaded");
	}

	public void onServerCreate(IServer server) {
		WMSLoggerFactory.getLogger(null).info("fantag::onServerCreate");
	}

	public void onServerInit(IServer server) {
		WMSLoggerFactory.getLogger(null).info("fantag::onServerInit");
	}

	public void onServerShutdownStart(IServer server) {
		WMSLoggerFactory.getLogger(null).info("fantag::onServerShutdownStart");
	}

	public void onServerShutdownComplete(IServer server) {
		WMSLoggerFactory.getLogger(null).info("fantag::onServerShutdownComplete");
	}

}
