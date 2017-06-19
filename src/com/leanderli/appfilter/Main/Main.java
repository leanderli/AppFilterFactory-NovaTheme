package com.leanderli.appfilter.Main;

import com.leanderli.appfilter.XmlUtils.AppFilterXmlUtil;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/6/19.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        AppFilterXmlUtil appFilterXmlUtil = new AppFilterXmlUtil();
        File xmlFile = new File("D:\\AdminTempDir\\temp.xml");
        if (!xmlFile.exists()) {
            xmlFile.createNewFile();
        }
        String txtPackageName =
                "        com.android.contacts/.activities.DialtactsActivity,\n" +
                        "        com.android.mms/.ui.ConversationList,\n" +
                        "        com.android.calendar/.AllInOneActivity,\n" +
                        "        com.android.settings/.Settings,\n" +
                        "        com.smartisanos.clock/.activity.ClockActivity,\n" +
                        "        com.smartisanos.music/.activities.MusicMain,\n" +
                        "        com.android.camera2/com.android.camera.CameraLauncher,\n" +
                        "        com.android.gallery3d/.app.Gallery,\n" +
                        "        com.netease.cloudmusic/.activity.LoadingActivity,\n" +
                        "        com.eg.android.AlipayGphone/.AlipayLogin,\n" +
                        "        com.tencent.tim/com.tencent.mobileqq.activity.SplashActivity,\n" +
                        "        com.tencent.mm/.ui.LauncherUI,\n" +
                        "        org.telegram.messenger/org.telegram.ui.LaunchActivity,\n" +
                        "        com.coolapk.market/.view.main.MainActivity,\n" +
                        "        com.android.vending/.AssetBrowserActivity,\n" +
                        "        in.zhaoj.shadowsocksr/com.github.shadowsocks.Shadowsocks,\n" +
                        "        com.github.shadowsocks/.Shadowsocks,\n" +
                        "        com.android.browser/.BrowserActivity,\n" +
                        "        com.smartisanos.security/com.smartisanos.securitycenter.MainActivity,\n" +
                        "        com.tencent.FileManager/com.fteam.openmaster.SplashActivity,\n" +
                        "        com.ares89.appextractor/.MainActivity,\n" +
                        "        com.baidu.netdisk/.ui.Navigate,\n" +
                        "        tv.danmaku.bili/.ui.splash.SplashActivity,\n" +
                        "        com.smartisanos.notes/.NotesActivity,\n" +
                        "        com.smartisan.bbs/.activity.MainActivity_,\n" +
                        "        me.drakeet.puremosaic/.MainActivity,\n" +
                        "        com.smartisan.reader/.activities.MainActivity_,\n" +
                        "        com.ares89.appextractor,\n" +
                        "        com.baidu.netdisk,\n" +
                        "        com.eg.android.AlipayGphone,\n" +
                        "        tv.danmaku.bili,\n" +
                        "        kellinwood.zipsigner2,\n" +
                        "        com.zhihu.android,\n" +
                        "        com.netease.zmq,\n" +
                        "        com.tencent.qt.sns,\n" +
                        "        one.hh.oneclient,\n" +
                        "        com.hitokoto,\n" +
                        "        com.didi.echo,\n" +
                        "        com.chinatelecom.bestpayclient,\n" +
                        "        com.google.android.youtube,\n" +
                        "        com.github.shadowsocks,\n" +
                        "        ctrip.android.view,\n" +
                        "        com.ximalaya.ting.android,\n" +
                        "        fm.xiami.main,\n" +
                        "        com.taobao.fleamarket,\n" +
                        "        com.netease.cloudmusic,\n" +
                        "        net.wargaming.wot.blitz,\n" +
                        "        com.sina.weibo,\n" +
                        "        com.netease.kittycraft,\n" +
                        "        com.netease.mail,\n" +
                        "        com.samruston.weather,\n" +
                        "        com.tencent.wifimanager,\n" +
                        "        com.tencent.mm,\n" +
                        "        com.google.zxing.client.android,\n" +
                        "        org.telegram.messenger,\n" +
                        "        com.taobao.taobao,\n" +
                        "        com.intsig.camscanner,\n" +
                        "        com.jingdong.app.mall,\n" +
                        "        in.zhaoj.shadowsocksr,\n" +
                        "        com.niksoftware.snapseed,\n" +
                        "        com.sorcerer.sorcery.iconpack,\n" +
                        "        com.sorcerer.sorcery.iconpack,\n" +
                        "        com.youzustars.rps,\n" +
                        "        edu.tsu.xinyutian.forcechat,\n" +
                        "        com.tencent.mtt,\n" +
                        "        cn.zhj.hydrogenwallpager,\n" +
                        "        com.tencent.androidqqmail,\n" +
                        "        com.qinlin.ocamera,\n" +
                        "        com.teslacoilsw.launcher,\n" +
                        "        com.tung91.miuics6,\n" +
                        "        com.intsig.BizCardReader,\n" +
                        "        com.mxtech.videoplayer.ad,\n" +
                        "        com.sankuai.meituan,\n" +
                        "        nz.co.codepoint.minimetro,\n" +
                        "        com.gkl90.leanderli.chinaweather,\n" +
                        "        com.lofter.android,\n" +
                        "        com.coolapk.market,\n" +
                        "        com.vectorunit.redcmgeplaycn,\n" +
                        "        com.jiemian.news,\n" +
                        "        com.bob.minicompass,\n" +
                        "        com.theme.mumu.flat,\n" +
                        "        com.youba.ringtones,\n" +
                        "        com.google.android.play.games,\n" +
                        "        com.autonavi.minimap,\n" +
                        "        com.lbt.gms,\n" +
                        "        cn.soloho.fuli,\n" +
                        "        com.fenqile.fenqile,\n" +
                        "        com.hoge.android.dingdone.manager,\n" +
                        "        me.drakeet.puremosaic,\n" +
                        "        com.sspai.cuto.android,\n" +
                        "        com.smartisan.reader,\n" +
                        "        com.smartisan.bbs";
        String[] appPackageName = txtPackageName.split(",");
        appFilterXmlUtil.CreateXMLByDOM4J(xmlFile, appPackageName);
    }
}
