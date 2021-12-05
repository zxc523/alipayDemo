package com.bookmall.servlet;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.bookmall.alipayconfig.AlipayConfig;
import com.bookmall.pojo.Order;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Servlet implementation class Payment
 */
@WebServlet("/payment")
public class PaymentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

//    Map<String, Commodity> mp;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentServlet() {
        super();
        // TODO Auto-generated constructor stub

    }

    /**
     * @see HttpServlet
     * #doGet(HttpServletRequest request, HttpServletResponse response)
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //获取订单信息
       // BizDaoImpl bdi=new BizDaoImpl();
        Order order=new Order();
        HttpSession session=request.getSession();
        /*
         *
         * mp=(Map<String, Commodity>)
         * session.getAttribute("pro"); System.out.println(mp);
         */
        //随机数
        int random =(int)(Math.random()*10000)+1;
        String oid =random +"103"+request.getParameter("oid");
        int sum=Integer.valueOf(request.getParameter("num"));
        double cprice =Double.valueOf(request.getParameter("total"));
        String cname = request.getParameter("cname");
        String author=request.getParameter("author");
        String title="书名："+cname+"\t 作者："+author+"\t 价格："+cprice;
        System.out.println("payment: oid:"+oid+"\t cname:"+cname+"\t author:"+author);
        /*
         * for (String item : mp.keySet()) {
         * System.out.println("mp: k:"+item+"\t value:"+mp.get(item));
         * oid=mp.get(item).getCid(); cprice=mp.get(item).getCprice();
         * cname=mp.get(item).getCname();
         * title="书名："+cname+"\t 作者："+mp.get(item).getAuthor()+"\t 价格："+cprice;
         *
         * }
         */
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no =oid;
        //付款金额，必填
        String total_amount =String.valueOf(cprice);
        //订单名称，必填
        String subject = cname;
        //商品描述，可空
        String body = title;

        System.out.println("商户订单号:"+out_trade_no+"付款金额:"+total_amount+"订单名称"+subject+"商品描述"+body);
        order.setCid(Integer.valueOf(request.getParameter("oid")));
        order.setOid(Integer.valueOf(oid));
        order.setIid(Integer.valueOf(oid));
        order.setCount(sum);
        order.setSubtoal(cprice);
        order.setState("已付款");

        session.setAttribute("out_trade_no", out_trade_no);
        session.setAttribute("total_amount", total_amount);
        session.setAttribute("subject", subject);
        session.setAttribute("body", body);
        session.setAttribute("order", order);
        request.getRequestDispatcher("alipayindex.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }



}

