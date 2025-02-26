package com.platform.rpc.remoting.net.impl.netty_http.client;

import com.platform.rpc.remoting.net.Client;
import com.platform.rpc.remoting.net.common.ConnectClient;
import com.platform.rpc.remoting.net.params.XxlRpcRequest;

/**
 * netty_http client
 *
 * @author AllDataDC 2022-11-24 22:25:15
 */
public class NettyHttpClient extends Client {

    private Class<? extends ConnectClient> connectClientImpl = NettyHttpConnectClient.class;

    @Override
    public void asyncSend(String address, XxlRpcRequest xxlRpcRequest) throws Exception {
        ConnectClient.asyncSend(xxlRpcRequest, address, connectClientImpl, xxlRpcReferenceBean);
    }

}
