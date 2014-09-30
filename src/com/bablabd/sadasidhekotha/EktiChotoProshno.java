package com.bablabd.sadasidhekotha;

import android.support.v4.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.ZoomControls;

public class EktiChotoProshno  extends Fragment {
	TextView tv;
	int x=16;


	public EktiChotoProshno(){
		return;
	}

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.ganimuktirbangladesh, container, false);
       ZoomControls zoom = (ZoomControls) rootView.findViewById(R.id.zoomc);
        tv = (TextView) rootView.findViewById(R.id.bbltext);
        tv.setTextSize(x);
        zoom.setOnZoomInClickListener(new OnClickListener() {
			
    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			x=x+1;
    			tv.setTextSize(x);
    		}
    	});
        zoom.setOnZoomOutClickListener(new View.OnClickListener() {
			
    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			
    			x=x-1;
    			tv.setTextSize(x);
    		}
    	});
       TextView titleTv=(TextView)rootView.findViewById(R.id.title);
       titleTv.setText("একটি ছোট প্রশ্ন");
       
        Typeface tf= Typeface.createFromAsset(this.getActivity().getAssets(),"AdorshoLipi.ttf");
        tv.setText("কয়েক দিন আগে আমার ৬০ নম্বর জন্মদিন গিয়েছে। বয়সের জন্য ৬০ সংখ্যাটি যথেষ্ট বড়—আমি সেদিন সন্ধ্যাবেলাতেই সেটা টের পেয়েছি। আমাকে অবাক করে দেওয়ার জন্য আমার ছাত্রছাত্রী আর সহকর্মীরা মিলে গোপনে ৬০ পাউন্ডের বিশাল একটা কেক নিয়ে এসেছে। কেকের সাইজ দেখে আমার ভিরমি খাওয়ার অবস্থা—রীতিমতো বিছানার মতো বিশাল! তবে যেটা দেখে আসলেই আমি ভিরমি খেয়েছি, সেটা হচ্ছে, জন্মদিন উপলক্ষে কেককে ঘিরে লাগানো ৬০টি মোমবাতি। সেই মোমবাতিগুলো দাউ দাউ করে জ্বলছে এবং ৬০টি মোমবাতির আলোয় চারদিকে রীতিমতো দিনের মতো আলো। তখন আমি টের পেলাম, ৬০ অনেক বড় সংখ্যা—একসঙ্গে ৬০টি মোমবাতি জ্বালালে দিনের মতো আলো হয়ে যায়।মনে আছে, সেদিন বাসায় ফিরে এসে আমি আয়নায় নিজেকে খুঁটিয়ে খুঁটিয়ে দেখেছি, সাদা চুল, তার থেকেও সাদা গোঁফ। আমি রীতিমতো একজন বয়স্ক মানুষ। তবে মজার কথা হচ্ছে, আমার নিজেকে কেন জানি একেবারেই বয়স্ক মনে হয় না। মনে হয়, এই সেদিন মাত্র আমি ইউনিভার্সিটির ছাত্র ছিলাম। কত বিচিত্র বিষয় নিয়ে ভাবতাম, কত রকমারি জিনিস নিয়ে চিন্তা করতাম—এত দিন পর দেখি, এখনো সেই বিচিত্র বিষয় নিয়ে ভাবি, মাথার মধ্যে এখনো সেই রকমারি জিনিস খেলা করে। শুধু একটা ব্যাপারে একটু পার্থক্য। যখন বয়স কম ছিল, তখন অনেক বিষয়ে নিজের ভেতরে আবছা একটা ধারণা ছিল, এখন তার অনেকগুলোই স্পষ্ট। মনে হয়, কম বয়সের সঙ্গে বেশি বয়সের এখানেই পার্থক্য।\nতাই আজকাল মাঝেমধ্যেই মনে হয়, মাথার মধ্যে যে চিন্তাগুলো স্পষ্ট হতে আমার জীবনের এতগুলো বছর লেগে গেছে, সেগুলো আজকালকার তরুণদের আগে-ভাগে জানিয়ে দিয়ে তাদের চিন্তার জগতে একটা শর্ট সার্কিট করে দিলে কেমন হয়? কেউ যদি আমাকে সেই দায়িত্ব দেয়, তাহলে আমি কোনটা দিয়ে শুরু করব?আমার মনে হয়, আমি শুরু করব বৈচিত্র্যের সৌন্দর্য নিয়ে। একটা বয়সে আমার মনে হতো, আমার নিজের সবকিছু বুঝি সঠিক। যে আমার থেকে ভিন্ন, সে বুঝি সঠিক নয়। আস্তে আস্তে আবিষ্কার করলাম, জীবনটা গণিত নয়, আমার থেকে ভিন্ন হয়েও একজন সঠিক হতে পারে। শুধু তা-ই নয়, জীবনের প্রশ্নের একটি মাত্র সঠিক উত্তর নেই, অনেক সঠিক উত্তর হতে পারে। ভিন্ন ভিন্ন চিন্তা, ভিন্ন ভিন্ন বিশ্বাস নিয়ে একসঙ্গে অনেকে যে সঠিক হতে পারে, সেটা যেদিন আমি আবিষ্কার করেছিলাম, আমি তখন খুব অবাক হয়েছিলাম।\n\nআমাদের দেশে এখন হঠাৎ এই জিনিসটা খুব গুরুত্বপূর্ণ হয়ে দাঁড়িয়েছে। মানুষ যখন ভাবে নিজের ধর্মটাই একমাত্র সঠিক ধর্ম, তখন বিষয়টা অনেক বিপজ্জনক হতে পারে। কিছুদিন আগে রামুতে যখন বৌদ্ধ ধর্মাবলম্বীদের উপাসনালয়ে আগুন দেওয়া হলো, তখন যেভাবে তার প্রতিবাদ হওয়া উচিত ছিল, সেভাবে কি প্রতিবাদ হয়েছে? বাংলাদেশের প্রতিটা কলেজ ও বিশ্ববিদ্যালয়ের তরুণ ছাত্রছাত্রীদের কি এই ঘটনার বিরুদ্ধে উচ্চকণ্ঠে প্রতিবাদ করা উচিত ছিল না? তারা কি সেই প্রতিবাদটুকু করেছে? আমার তো চোখে পড়েনি। কেন তারা করেনি?	\nকোনো তরুণ ছাত্র বা ছাত্রী, যে আমার এই লেখাটি পড়ছে, তাকে আমি জিজ্ঞেস করি, তুমি কি এই ঘটনার প্রতিবাদ করেছিলে? তুমি কি জানো, ফেসবুকে ‘লাইক’ দেওয়া আসলে সত্যিকারের প্রতিবাদ না?তোমার জীবনে যদি খুব বড় একটা দুর্ঘটনা ঘটে যায় আর সবাই যদি ফেসবুকে লাইক দিয়ে তাদের দায়িত্ব শেষ করে দিল, তখন তোমার কেমন লাগবে?\n \n৩১-১২-১২\n\n\n\n");
        titleTv.setTypeface(tf);
        tv.setTypeface(tf);
        return rootView;
    }
}