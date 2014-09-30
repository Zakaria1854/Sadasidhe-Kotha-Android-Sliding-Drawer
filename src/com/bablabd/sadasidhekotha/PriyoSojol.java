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

public class PriyoSojol  extends Fragment {
	TextView tv;
	int x=16;


	public PriyoSojol(){
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
       titleTv.setText("প্রিয় সজল");
       
        Typeface tf= Typeface.createFromAsset(this.getActivity().getAssets(),"AdorshoLipi.ttf");
        tv.setText("এয়ারপোর্টে পরের ফ্লাইট ধরার জন্যে বসে আছি তখন আমার মেয়ে এসে আমাকে বলল এভারেস্ট অভিযানে বাংলাদেশের একজন মারা গেছে। মানুষটি কে,কীভাবে মারা গেছে কিছুই শুনিনি কিন্তু মুহূর্তে আমার জগতটি গভীর বিষাদে ঢেকে গেলো। আমি সাথে সাথে বুঝে গেলাম সজল আর নেই। এই সুদর্শন প্রতিভাবান তরুণটিকে আবার দেখবো না। মাটির মানুষ হয়ে সুউচ্চ অহংকারী এভারেস্টকে পদানত করার অপরাধে সে আরো একজন পর্বতারোহীর উপর প্রতিশোধ নিয়েছে।\n আমি জানতাম সজল দ্বিতীয়বারের জন্যে এভারেস্টে যাচ্ছে, মুহিত যাচ্ছে কাঞ্চনজঙ্ঘায়। বছরের এই সময়টাতে আমাদের তরুন অভিযাত্রীরা হিমালয়ের চূড়ায় উঠে। আর আমরা দুর দুর বক্ষে সেই প্রতীক্ষিত এস.এম.এস এর জন্যে বসে থাকি যখন আমাদের জানানো হয় দেশের তরুনেরা পাহাড়ের চুড়ায় উঠে আবার সুস্থ দেহে নিচে ফিরে এসেছে। এবারে ভাগ্য আমাদের নিষ্ঠুর ভাবে বিমুখ করেছে, এভারেস্ট সজলকে আমাদের কাছে ফিরিয়ে দেয়নি। তার দুই বছরের বাচ্চাটি যখন বড় হবে তার কাছে দুঃসাহসী বাবার কোন স্মৃতি থাকবে না। একটা গভীর বেদনায় আমার বুকের ভেতরটা দুমড়ে মুচড়ে গেল।\nআমি সজলকে জানতাম ফিল্মমেকার হিসেবে, সে যে একই সাথে একজন পর্বতআরোহী সেটা আমি জেনেছি পরে। আমাদের নূতন প্রজন্ম একাত্তরকে গভীর ভাবে অনুভব করে , সজলও তাদের একজন। ‘একাত্তরের শব্দসেনা’ নামে তার একটি অসাধারন ডকুমেন্টরী রয়েছে। আমার সাথে তার পরিচয় এবং অন্তরঙ্গতা হয়েছিল যখন সে আমার একটি কিশোর উপন্যাসকে (কাজলের দিনরাত্রি) চলচ্চিত্রায়িত করার পরিকল্পনা করছিল। এই দেশে সিনেমা তৈরির মত কঠিন কাজ আর কিছু হতে পারে না- তার পরেও অসাধারন দক্ষতায় সে চলচ্চিত্রটি শেষ করেছিল। শিশু চলচ্চিত্র উৎসবে ছবিটি যখন প্রথম দেখানো হয়েছিল সজলের সাথে আমিও সেখানে ছিলাম। ছবিটা শেষ হবার পর বাচ্চাদের আনন্দোল্লাস শুনে আমার বুকটি ভরে গিয়েছিল। সজলের সুখের হাসিটির কথা আমি কোন দিন ভুলব না। সে বাচ্চাদের আনন্দ দিতে পারে এমন একটি ছবি তৈরি করতে পেরেছে এর চাইতে আনন্দের আর কী হতে পারে। মার্চ মাসে ছবিটি রিলিজ করার কথা ছিল। এভারেস্টে যাবার প্রস্তুতির জন্যে সজল সম্ভবত সেটা একটু পিছিয়েছিল। এখন হঠাৎ করে সবকিছু অর্থহীন হয়ে গেছে। ছবিটি মাত্র কিছু দিন আগে আমার কাছে যতটুকু আনন্দের ছিল এখন ঠিক ততটুকু দুঃখের। বাংলাদেশের মত সমতল দেশের তরুণরা যখন পাহাড়ে উঠতে শুরু করেছে সেটি ছিল আমাদের সবার জন্যে সাফল্য আর অর্জনের নতুন দিগন্ত। এই তরুণরা তাদের সকল অর্জন আমাদের মুক্তিযুদ্ধের স্মৃতির জন্যে উৎসর্গ করে এসেছে, আমাদের প্রজন্ম যেটা পারেনি এই নতুন প্রজন্ম সেটা করেছে- দেশের শিশু কিশোরকে দেশকে ভালোবাসতে শিখিয়েছে। তাদের অভাবনীয় সাফল্য দেখে সাধারনের মনে হতে পারে কাজটি বোধ হয় সহজ, কিছু সময়, কিছু ট্রেনিং আর কিছু স্পন্সর হলেই বুঝি একজন এভারেস্টে যেতে পারে। কিন্তু এটা যে কত কঠিন সেটা শুধুমাত্র পর্বতারোহীরাই জানে- সাধারন মানুষের পক্ষে কল্পনা পর্যন্ত করা সম্ভব নয়। আট হাজার মিটার কিংবা পচিশ হাজার ফুট উচ্চতায় আসলে মানুশের বেঁচে থাকার কথা না, আক্ষরিক অর্থেই এটি হচ্ছে মৃত্যু উপত্যকা। যারা বেঁচে থাকে তারা শুধু মাত্র তাদের শারীরিক আর মানসিক শক্তির জোরে নিশ্চিত মৃত্যুকে পরাস্ত করে বেঁচে থাকে। এতদিন আমরা শুধু সাফল্যের কথা শুনে এটাকে একটা দুঃসাহসিক অভিযান হিসেবে জেনে এসেছি , সজলের মৃত্যুর ঘটনাটি আমাদের চোখে আঙ্গুল দিয়ে দেখিয়েছে এটি মৃত্যুকে আলিঙ্গন করে আসা, মৃত্যু কখনও কখনও আলিঙ্গন থেকে মুক্ত করে দেয়, কখনো কখনো করে না। সজলকে করেনি।\n সজল সেটি জানত, আমরা যত টুকু জানতাম সে তার থেকে বেশি জানত। এর আগে সে হিমালয়ের অন্য চুড়ায় উঠেছে, এভারেস্টের কঠিন পথেও চেষ্টা করেছে। সব কিছু জেনেও সে এই পথে গিয়েছে বাংলাদেশের পতাকাটি এভারেস্টের চুড়ায় উড়িয়ে এসেছে। দিয়ে এসে আমাদের সেই কাহিনী বলতে পারেনি- এই কষ্টটি আমরা কোথায় রাখব?\n প্রিয় সজল, তোমাকে আমরা ভুলবো না, তোমার অভাবটি কেউ পূরন করতে পারবে না।\n\n২৪ মে ২০১৩ তে প্রকাশিত\n\n\n\n");
        titleTv.setTypeface(tf);
        tv.setTypeface(tf);
        return rootView;
	}
}