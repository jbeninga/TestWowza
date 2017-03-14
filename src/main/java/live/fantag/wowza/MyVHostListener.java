package live.fantag.wowza;

import com.wowza.wms.amf.AMFDataList;
import com.wowza.wms.client.IClient;
import com.wowza.wms.logging.WMSLoggerFactory;
import com.wowza.wms.request.RequestFunction;
import com.wowza.wms.vhost.IVHost;
import com.wowza.wms.vhost.IVHostNotify;

public class MyVHostListener implements IVHostNotify
{

	/*
	 * Called when the Virtual Host is first created.
	 */
	@Override
	public void onVHostCreate(IVHost vhost)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onVHostCreate");
	}

	/*
	 * Called when the Virtual Host is first initialized.
	 */
	@Override
	public void onVHostInit(IVHost vhost)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onVHostInit");
	}

	/*
	 * Called when the Virtual Host starts to shut down.
	 */
	@Override
	public void onVHostShutdownStart(IVHost vhost)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onVHostShutdownStart");
	}

	/*
	 * Called when the Virtual Host shutdown process is complete.
	 */
	@Override
	public void onVHostShutdownComplete(IVHost vhost)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onVHostShutdownComplete");
	}

	/*
	 * Called whenever an RTMP client connects to the Virtual Host.
	 */
	@Override
	public void onVHostClientConnect(IVHost vhost, IClient inClient, RequestFunction function, AMFDataList params)
	{
		WMSLoggerFactory.getLogger(null).info("fantag::onVHostClientConnect");
	}

}

