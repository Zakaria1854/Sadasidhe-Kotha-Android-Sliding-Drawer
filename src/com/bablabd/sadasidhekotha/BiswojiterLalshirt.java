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

public class BiswojiterLalshirt  extends Fragment {
	TextView tv;
	int x=16;


	public BiswojiterLalshirt(){
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
       titleTv.setText("বিশ্বজিতের লাল শার্ট");
       
        Typeface tf= Typeface.createFromAsset(this.getActivity().getAssets(),"AdorshoLipi.ttf");
        tv.setText("আমি মনে হয় বাংলাদেশের অল্প কয়জন সৌভাগ্যবান মানুষের একজন, আমার বাসায় টেলিভিশন নেই বলে আমাকে টেলিভিশন দেখতে হয় না। তাই ডিসেম্বরের ৯ তারিখ যখন ছাত্রলীগের কর্মীরা বিশ্বজিৎকে কুপিয়ে খুন করেছে, আমাকে সেই দৃশ্যটি দেখতে হয়নি। যারা দেখেছে, তাদের প্রায় সবারই মানুষ সম্পর্কে ধারণাটি পাল্টে গেছে। রাজনীতি, আইন, আইনের শাসন—এসব বিষয় নিয়ে তাদের অত্যন্ত নিষ্ঠুর একটি স্বপ্ন ভঙ্গ হয়েছে। সবার ভেতরেই যে একজন করে নিষ্পাপ মানুষ থাকে, সেই মানুষটি ভয়ংকরভাবে আতঙ্কগ্রস্ত হয়েছে।\nআমি কাপুরুষের মতো টেলিভিশন থেকে নিজেকে লুকিয়ে রাখতে পেরেছিলাম, কিন্তু খবরের কাগজ থেকে নিজেকে লুকিয়ে রাখতে পারিনি। খবরের কাগজের ছবিগুলো না দেখে দ্রুত পৃষ্ঠাগুলো উল্টে ফেলার চেষ্টা করলেও ছবিগুলো আমার মাথায় গেঁথে গেছে, চারপাশে ঘিরে যখন ছাত্রলীগের কর্মীরা তাকে হত্যা করছে, সেই মুহূর্তের বিশ্বজিতের চোখের দৃষ্টি আমাদের সবাইকে বাকি জীবন তাড়া করে বেড়াবে, সেই দৃষ্টিতে আতঙ্ক বা যন্ত্রণা ছিল না, একধরনের অসহায় ব্যাকুলতা ছিল, চারপাশে অসংখ্য মানুষ দৃশ্যটি দেখছে, কেউ তাকে বাঁচাতে এগিয়ে আসছে না, সেটি নিয়ে হয়তো জগৎসংসারের প্রতি একটা তীব্র অভিমান ছিল। কোনো কোনো ছবিতে বিশ্বজিতের শার্টটি ছিল হালকা সাদা রঙের, আবার কোনো কোনো ছবিতে সেটি ছিল উজ্জ্বল লাল রঙের, সেটি নিয়েও আমার মনে একটা প্রশ্ন ছিল। ঘটনার সপ্তাহ খানেক পর একটু সাহস সঞ্চয় করে আমি যখন খবরের কাগজগুলো পড়েছি, ছবিগুলো নতুন করে দেখেছি, তখন আমি বুঝতে পেরেছি বিশ্বজিৎ লাল শার্ট পরেনি, রক্তে ভিজে তার শার্ট লাল হয়েছিল।দেশের সব মানুষের মতো আমার মনেও অনেক প্রশ্ন জন্ম নিয়েছে, খবরের কাগজ, টেলিভিশনের ক্যামেরাম্যান আর সাংবাদিকেরা শুধু ছবি তুলেই তাদের দায়িত্ব পালন না করে বিশ্বজিৎকে বাঁচানোর চেষ্টা করেনি কেন? এত কাছে পুলিশ থাকার পরও তারা এগিয়ে গেল না কেন? যখন তাকে হাসপাতালে নিয়ে যাওয়া হলো তখন হিপোক্রেটিক শপথ নেওয়া চিকিৎসকেরা তাকে বাঁচানোর চেষ্টা করল না কেন? এই প্রশ্নগুলোর উত্তর আমার জানা নেই।আবার কিছু কিছু ভয়ংকর প্রশ্নের উত্তর আমি অনুমান করতে পারি। যেমন ছাত্রলীগের যে কর্মীরা বিশ্বজিৎকে কুপিয়ে হত্যা করছিল, তারা দেখেছে চারপাশ থেকে ক্যামেরায় তাদের ছবি তোলা হচ্ছে, তার পরও তারা কেন ক্যামেরার সামনে এই পৈশাচিক উন্মত্ততায় বিশ্বজিৎকে হত্যা করেছে? কিংবা প্রশ্নটি আরও ভয়ংকরভাবে করা যায়, চারপাশে ক্যামেরা ছিল বলেই কি তারা এত উন্মত্ত হয়েছিল, যেন সবাইকে দেখানো যায় তাদের কত সর্বগ্রাসী ক্ষমতা, কত ভয়ংকর?\nবহু বছর আগে কাদের সিদ্দিকী যখন আওয়ামী লীগ থেকে বের হয়ে নিজের রাজনৈতিক দল গঠন করার জন্য একটি সম্মেলনের আয়োজন করেছিলেন তখন ছাত্রলীগের কর্মীরা এসে পুরো আয়োজনটি লন্ডভন্ড করে দিয়েছিল। আমি রাজনীতি ভালো না বুঝলেও অন্তত এতটুকু জানি এগুলো রাজনীতিতে অত্যন্ত গ্রহণযোগ্য পদ্ধতি ‘মাঠ দখল’ বা ‘রাজপথ ছাড়ি নাই’ এই ধরনের বাক্যাংশ দিয়ে এগুলোকে ব্যাখ্যা করা হয়। (সত্যি কথা বলতে কি, বিএনপি আর জাতীয় পার্টি এই দুটি দলই এই কায়দায় তৈরি হয়েছে, মিলিটারি জেনারেলরা প্রথমে জোর করে ক্ষমতা দখল করেছে, তারপর রাজনৈতিক দল করে গণতন্ত্রের জন্য জায়েজ করেছে) তবে আমার বক্তব্য একটু ভিন্ন জায়গায়, ছাত্রলীগের যে কর্মীরা কাদের সিদ্দিকীর সম্মেলনটি লন্ডভন্ড করেছিল, তারা সেখানেই থেমে যায়নি, তারপর তারা সংবাদপত্র অফিসে গিয়ে নিশ্চিত করেছিল সম্মেলন ভন্ডুলকারী সন্ত্রাসী বাহিনী হিসেবে তাদের নামগুলো যেন পত্রিকায় ছাপা হয়। তাদের কাছে এটা গুরুত্বপূর্ণ ছিল যে দেশের মানুষ এবং তাদের দলের নেতারা যেন ঠিকভাবে জানতে পারে কারা এই ‘গুরুদায়িত্ব’ সঠিকভাবে পালন করেছে।\nআমি পরে অসংখ্যবার এটা দেখেছি এবং এটা শুধু ছাত্রলীগের ব্যাপার নয়। প্রতিটি রাজনৈতিক দলের ছাত্রসংগঠনের এই একই ব্যাপার। সন্ত্রাসী হিসেবে নিজের নাম ছড়িয়ে দেওয়ার মধ্যে বিশাল কৃতিত্ব, হলে-হোস্টেলে ফ্রি খাওয়া যায়, কন্ট্রাক্টরদের কাছ থেকে চাঁদা তোলা যায়, সংগঠনের গুরুত্বপূর্ণ পদে থাকা যায় এবং ভবিষ্যতে বড় রাজনৈতিক নেতা হওয়া যায়। আমার ধারণা, বিশ্বজিতের বেলাতেও ঠিক একই ব্যাপার ঘটেছে। তাকে সবাই মিলে যখন কুপিয়ে হত্যা করেছিল, তখন তারা একবারও ভাবেনি সেটি গোপনে করতে হবে, এটি ছিল একধরনের বীরত্ব প্রদর্শন এবং ছাত্রলীগের কর্মীরা ধরেই নিয়েছিল এটা যত মানুষ দেখবে সেটা তাদের তত মর্যাদার জায়গায় নিয়ে যাবে। আমার ধারণা, টেলিভিশন-ক্যামেরা ইত্যাদি থাকার কারণে তাদের নৃশংসতা আরও কয়েক গুণ বেড়ে গিয়েছিল।\nছাত্রলীগের কর্মীদের ভাবনা যে মোটেও ভুল ছিল না, আমরা সঙ্গে সঙ্গে তার প্রমাণ পেয়েছি। একেবারে চোখের সামনে ঘটনা ঘটেছে, সবার নাম-পরিচয় জেনেও ছাত্রলীগ কর্মীদের বাঁচানোর জন্য পুলিশ মামলা করেছে অজ্ঞাত ব্যক্তিদের নাম দিয়ে। স্বরাষ্ট্রমন্ত্রী ঘোষণা দিলেন হত্যাকাণ্ডে জড়িত আটজনকে গ্রেপ্তার করা হয়েছে। সংবাদপত্র আর টেলিভিশনের কারণে ততক্ষণে দেশের সব মানুষ হত্যাকারীদের চিনে গেছে, তাই তারা বিস্মিত হয়ে দেখল আসল অভিযুক্ত ব্যক্তিদের গ্রেপ্তার না করে অন্যদের গ্রেপ্তার করে বসে আছে। ছাত্রলীগের কর্মীদের বাঁচানোর জন্য নতুন জজ মিয়ার নাটক মঞ্চস্থ হতে যাচ্ছে। (সাগর-রুনির হত্যাকারীদের গ্রেপ্তার দেখানোর জন্য মাত্র কিছুদিন আগে এই স্বরাষ্ট্রমন্ত্রী অন্য মামলার আসামিদের নাম ঘোষণা করেছেন। রামুর ঘটনার জন্য সঙ্গে সঙ্গে অন্যদের দোষারোপ করেছেন কিন্তু পরের দিন কিংবা তার পরের দিনে আক্রান্ত হওয়া মন্দিরকে রক্ষা করতে পারেননি) পত্রপত্রিকাগুলো লেগে থাকল এবং তখন সত্যিকারের অভিযুক্ত ব্যক্তিরা শেষ পর্যন্ত গ্রেপ্তার হতে শুরু করল।\nএখন ভিন্ন একটি নাটক মঞ্চস্থ হতে শুরু করল, সবাই প্রমাণ করতে শুরু করল এই অভিযুক্তরা কেউ ছাত্রলীগের কর্মী নয়। ছাত্রলীগ বলল, এরা তাদের মিটিং-মিছিলে যোগ দিতে পারে কিন্তু এরা তাদের কর্মী নয়। আওয়ামী লীগের যুগ্ম সাধারণ সম্পাদক মাহবুব উল আলম হানিফ বললেন, আওয়ামী লীগকে দায়ী করা যাবে না, এর আগের দিন আনন্দ মিছিলে বোমা পড়েছে। স্বরাষ্ট্রমন্ত্রীও জোর গলায় বললেন এরা ছাত্রলীগের কর্মী নয়। সবচেয়ে হূদয়বিদারক কাজটি করলেন প্রধানমন্ত্রীর প্রেস সচিব। ঘোষণা দিলেন অভিযুক্তরা সবাই জামায়াত-শিবির, কারণ তাদের আত্মীয়স্বজন জামায়াত-শিবির। (কয় দিন আগে আমি শিবিরের তরুণদের উদ্দেশ করে একটা লেখা লিখেছিলাম, সেটা পড়ে একজন আমার কাছে খুব দুঃখ করে লিখেছে, সে তার বাবা-মাকে ঘৃণা করে; কারণ, তারা জামায়াত করে, সে দেশকে খুব ভালোবাসে) বিশ্বজিতের মতো একজন তরুণের এ রকম একটি মৃত্যুর পর কেন পুরো রাষ্ট্রযন্ত্র এই হত্যাকারীদের রক্ষা করার জন্য এত ব্যস্ত হয়ে পড়ল? এই প্রশ্নের উত্তর আমি জানি না, শুধু এটুকু জানি যে বিশ্বজিৎকে প্রকাশ্যে কুপিয়ে হত্যা করা যত বড় অপরাধ, তার হত্যাকারীদের রক্ষা করার চেষ্টা করা তার থেকে অনেক বড় অপরাধ। যারা মনে করে দেশের সাধারণ মানুষের চোখে ধুলো দিয়ে এত বড় একটা অপরাধ করে পার পাওয়া যাবে, তারা এই দেশের মানুষকে চেনে না। আমি রীতিমতো অপমানিত বোধ করি, যখন দেখতে পাই এই দেশের সরকার বা রাজনৈতিক দলগুলো মনে করে দেশের মানুষ নেহাত নির্বোধ—তাদের যেটা বলায় তারা সেটাই বিশ্বাস করে বসে থাকবে! এই দেশে যা কিছু ঘটছে, আমরা সেগুলো শুধু দূর থেকে খবরের কাগজ বা টেলিভিশনের ভেতর দেখি না, আমরা অনেক সময় নিজের চোখে সরাসরি দেখি, তাই প্রকৃত সত্যটা আমরা খুব ভালোভাবে জানি। তাই যখন কাউকে দেখি সেই সত্যটাকে লুকানোর চেষ্টা করছে বা বিকৃত করার চেষ্টা করছে, সেটা আমাদের কাছে গোপন থাকে না। যত অপ্রিয় হোক, যত ভয়ংকর হোক, যত নিষ্ঠুর হোক সেটাকে সত্য হিসেবে গ্রহণ করতে হয়। তা না হলে সেটা আরও শত গুণ অপ্রিয়, সহস্র গুণ ভয়ংকর আর লক্ষ গুণ নিষ্ঠুর হয়ে ফিরে আসে।কিছুদিন আগে একজন আমার সঙ্গে রাজনীতি, নির্বাচন, তত্ত্বাবধায়ক সরকার—এ ধরনের বড় বড় বিষয় নিয়ে কথা বলছিল। আমি তাকে বলেছিলাম, মাঝেমধ্যে আমার মনে হয় এই দেশের গণতন্ত্র বুঝি প্রায় একটা কৌতুকের মতো। বিশাল দক্ষযজ্ঞ করে নির্বাচন করে সাংসদেরা একদিনও সংসদে যান না (বিনা শুল্কে গাড়ি আমদানি আর বেতন-ভাতা রক্ষা করার জন্য এক-আধ দিন যেতে পারেন—আমি নিশ্চিত নই)! কাজেই এই দেশে বিরোধী দল হিসেবে সরকারের সমালোচনা করার কেউ নেই। সে জন্য সরকারকে সতর্ক করে গণতন্ত্রকে সচল রাখার পুরো দায়িত্বটি পালন করতে হয় সংবাদমাধ্যমের। আমাদের খুব সৌভাগ্য, আমাদের সংবাদমাধ্যম যথেষ্ট স্বাধীন এবং এবার আমরা দেখেছি, বিশ্বজিৎকে হত্যা করে সত্যিকারের অপরাধীরা যেন পার না পেয়ে যায়, সেটি এই সংবাদপত্রগুলো নিশ্চিত করেছে।\nআমার ধারণা, আওয়ামী লীগের বড় বড় নেতা সংবাদপত্রের এই ‘বাড়াবাড়ি’ দেখে খুব বিরক্ত হচ্ছেন, দেশে প্রতিদিন শত শত খুন হচ্ছে, ক্রসফায়ার হচ্ছে, গুরুত্বপূর্ণ মানুষ গুম হয়ে যাচ্ছে, তার মধ্যে একজন ছাপোষা দরজির মৃত্যু নিয়ে এত হইচই করার কী অর্থ? অনেকে নিশ্চয়ই এটাকে দেখছেন পরবর্তী নির্বাচনে তাদের বিজয়ের সম্ভাবনাকে কমিয়ে আনার একটা সুগভীর ষড়যন্ত্র হিসেবে। সত্য কথাটি হচ্ছে, সম্ভবত সত্যিই আওয়ামী লীগ যেন কিছুতেই পরের নির্বাচনে জিততে না পারে, কিংবা এই মুহূর্তেই যেন তাদের দুর্বল আর বিপর্যস্ত দেখায়, সে জন্য একটা গভীর ষড়যন্ত্র হচ্ছে এবং সেই ষড়যন্ত্রটি করছে বিশ্বজিৎ হত্যাকারী ছাত্রলীগ এবং এই ঘটনাকে ধামাচাপা দেওয়ার চেষ্টারত আওয়ামী লীগের নেতা, মন্ত্রী, পুলিশ ও আমলারা। এই বিষয়টি যত তাড়াতাড়ি তারা বুঝতে পারবে, দেশের জন্য তত মঙ্গল। আমরা খুব দ্রুত যুদ্ধাপরাধীদের বিচার দেখতে চাই। এই দেশকে গ্লানিমুক্ত করতে চাই।\nআমি নিজেকে বিশ্বজিতের আপনজনের জায়গায় বসিয়ে পুরো বিষয়টি কল্পনা করার চেষ্টা করে বুঝতে পেরেছি, তাদের পৃথিবীর কোনো মানুষ কোনো দিন সান্ত্বনা দিতে পারবে না। মৃত্যুর পূর্বমুহূর্তে বিশ্বজিতের মনের ভেতর কী চিন্তা কাজ করেছিল, আমরা কোনো দিন সেটি জানতে পারব না। তার উদ্ভ্রান্ত ব্যাকুল দৃষ্টি দেখে সেটা শুধু হয়তো কল্পনা করতে পারব। পবিত্র কোরআন শরিফে আছে (৫.৩২) বিনা কারণে যদি কখনো কোনো মানুষকে হত্যা করা হয় তাহলে মনে করা যায় যেন পুরো মানবজাতিকেই হত্যা করা হলো। এ ব্যাপারে বিন্দুমাত্র সন্দেহ নেই, আমাদের এই প্রিয় মাতৃভূমিতে ডিসেম্বরের ৯ তারিখ সকাল নয়টার সময় পুরান ঢাকায় আমরা সমগ্র মানবজাতিকে হত্যা করেছি।\nআমি জানি এই তীব্র অপরাধবোধ থেকে আমাদের মুক্তি নেই। সত্যি যদি কোনোভাবে সান্ত্বনা খুঁজে পেতে চাই তাহলে কোরআন শরিফের সেই অংশেই পরের লাইনে ফিরে যেতে হবে, যেখানে বলা হয়েছে, যদি কেউ একজনের প্রাণ রক্ষা করে তাহলে সে যেন পুরো মানবজাতির প্রাণ রক্ষা করল।\nআমরা কি মুক্তিযুদ্ধের রক্তস্নাত এই মাতৃভূমিতে সমগ্র মানবজাতিকে রক্ষা করার নিশ্চয়তা দেব?\n১৮-১২-১২\n\n\n\n");
        titleTv.setTypeface(tf);
        tv.setTypeface(tf);
        return rootView;
    }
}
