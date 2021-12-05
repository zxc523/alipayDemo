package com.bookmall.alipayconfig;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2021000118612566";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCA6sGIjo17dUXixHN3PEtTMw3ZUuWy/s+WvWbX2LxQyXx6phxLstPMFOAJqMka0mRcV3cVg91VnEamqPysmN3IQEyb48I6YHdif2VTVIVtBA68OV84vv0QYW5ykA7MDab+DQMdDk/aXVwsXJ0hJYLEVNcAq2C1ORE4UGwvAox/YLw9p4k5h+RUWj5LzugGfa3SvkTQsWL/VMPW6YDVG0jElPPgzzWaCjsYqAEnriq2vdE3MmeT/o7x2fT6ClM3+4h0XrIgKsb8rFE1OTr2kKzEm34XkTyHz9BPBu59GmJzvfzvHyv9yQEj+FknQ3R1WoMFd1mk+yZu8YrEwpBWfGA/AgMBAAECggEAQtd1WRRwjx6TCazKIXyFobHK8G9m4ZP0ljfF5wxdN5YAkKcn7Kff4OTB9MAq5VlI6AgBmoowbH8GssrTl7n65CVSk1FYF2SFAfED3FzqgUelTDqDAK0mESQzW/sNcQdzGi4s+xe8l3/olqe+YL1OO/WxNIunLM9V+ljYftdXeYM2CM6PPfDQIG8on2TSgNf7CBMMB7H2updnJJUeu14f1nofcpUKqN5olfrAViAUpWBPHKYxmmkyNNkUaWG3Rhpzd16/1Cq+gFquybTYlh1ciXc7MIf2jn4hl/Wz9b7Sj3S6PE6mtfm2DAvJrWgEm0dvbYwi8QqYtRk6vmCapvbxwQKBgQC9hVW1besMaaL//4XZ6uP1+cx6Y/wkW9HYy9Hcan4GMIlIF4ZFnEP+mXSwYXgqUp15EGFyVFAZdGsDCZkEKf7P0jXN6aoZ5my52Sc86lbRcRfJhsHW8JIbql2YsMYax/npg/bwcAIUrQUXV72cSbuNaw0jndQv3KocKqJtFlXz2QKBgQCuI0u1oEcQBP/NJouE+rQ8/C/t19q2/sZ/q81k08AK0sXNgJ/1hZYhGdR+ADfoyL2821jxJVJzdJvtfaQU/DG/ZnHip24+STLKSRZ3HACUXcMipuffppMjho/ANdejQ+y+8PtO5WCdKk1ZTqa0+kJF0O7c/8me6O8L0j4VofUd1wKBgQC6BNN5fugEiPMqnl185WbXGlavks/7x/wS9QuJcyU7Ygx9LEnorVa34Vt9fE38DJbwKznahBMSyQf4NUVxpt6qkUOqVr1VKqxxRkmTKtgIPx7/+Trtg7eFXBT+OBRaWQpdP9/zY51HOgQTQ1Wiv2RNjFObL+EDEW4Os3I17IR1EQKBgQCap/RMmc2jN51sOUh+UR6UbzGuHiA8mCf5Kb9gRgPwWOOeMRdfukXsngEv6se88dQ5j+H9QbVpnu4BTa3ViWoxYC3TK/poTSBTsffGz1Lgcimlc/DJnCpfydmPzwH2GZSAvIultWhKDVDm+UhrwTvsv7P1CSOrA5uStyW2lsGYvwKBgGdbbUG6cjH+1Gmb7zJDQm+p7fPh55OHgJynP6cYM4dM3QRI4Bov5LeT9LD3PztRwn214F2ElLcHlS02aD0psFqVuILENyvOxN5JjnKVrbizt3TgihGxz32+huiwT7xt8f4JK7aRvvlmkZHhg7Xk7blrbWqY4m8krsniz6x9IzTG";
    
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAogVQhbPNqktnmu0ersxfoRy12DIU5pB59R5lE4DD9w/i5eTyXUcXVlOcIvhOehIjt3hjJ1VcoliSQpi8Oe9c0b37WPoRTCQK+pAEd+d2us4OK4O8tH84HK0LChTnLDaz+kLcJkcRlrWiJ+lbwm6kuHTNAo47Av/9nVrpHB9pf1I5J7FlQYKdnyrRQgygb/dzMF68lI025joooPWtt+KVyXhDaE5aFiTmRu8YRS6aLwY/046Q8/C3nYN3uUNCAiEl4ype8ZpBsbOoEa/rK+AjLJrHbSCOE4ZfYuFuz9UHt9lonbQMhcEYE4gWU0Md5Yb9UsiaHg9z128syPn+i/l6nQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhout:8080/alipayDemo/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/alipayDemo/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

