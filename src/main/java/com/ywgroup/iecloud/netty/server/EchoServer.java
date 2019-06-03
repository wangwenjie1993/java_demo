package com.ywgroup.iecloud.netty.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @program: demo
 * @description:
 * @author: wxhai
 * @create: 2019-04-25 11:28
 **/
public class EchoServer {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        // 创建分组
        NioEventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        // 创建引导类
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        Integer port = 8888;
        serverBootstrap.group(eventLoopGroup)
                .channel(NioServerSocketChannel.class)
                .localAddress(port)
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        socketChannel.pipeline().addLast(new EchoServerHandler());
                    }
                });
        try {
            ChannelFuture sync = serverBootstrap.bind().sync();
            sync.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
            try {
                eventLoopGroup.shutdownGracefully().sync();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }

    }


}
