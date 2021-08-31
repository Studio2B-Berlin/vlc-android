package org.videolan.vlc.gui.video

data public class ViewStatistics(val vStats:List<ViewStatistic>){}

data public class ViewStatistic(val title:String, val progress:Int, val dateTime:String) {}