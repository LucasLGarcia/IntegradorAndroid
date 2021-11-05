package com.example.notbored.App.UI.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notbored.databinding.ActivityTermsAndConditionsBinding

class TermsAndConditions : AppCompatActivity() {
    private lateinit var binding: ActivityTermsAndConditionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTermsAndConditionsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val ipso =
            "Lorem ipsum dolor sit amet consectetur adipiscing elit inceptos ridiculus iaculis,\n" +
                    "nullam ligula elementum duis tellus maecenas nec fermentum sed dictum\n" +
                    "laoreet, taciti donec habitant quam purus ultricies porta posuere sociis. Cubilia\n" +
                    "senectus netus integer tempor dignissim viverra nostra tellus scelerisque aliquet,\n" +
                    "semper penatibus tempus sociosqu class sociis bibendum justo etiam, rutrum\n" +
                    "aenean et eget pretium volutpat eu dictum dictumst.\n" +
                    "Praesent gravida ridiculus cursus luctus maecenas in libero mi interdum, auctor\n" +
                    "ullamcorper eget nam eros condimentum litora tristique erat, fusce rhoncus\n" +
                    "mauris cras aptent non et ultricies. Iaculis porttitor etiam pulvinar proin fringilla\n" +
                    "ad, sem ornare sociosqu ultrices litora himenaeos egestas, eros laoreet mauris\n" +
                    "leo porta. Nibh interdum facilisis dapibus magnis phasellus tortor fusce nostra\n" +
                    "quam, ante non elementum himenaeos id hac et hendrerit eros, dui at sollicitudin\n" +
                    "turpis viverra molestie cras quis.\n" +
                    "Dignissim faucibus auctor in vitae porttitor tellus nascetur tempor sociosqu,\n" +
                    "elementum dis ultricies eu tempus tincidunt lectus posuere, et ac interdum\n" +
                    "commodo montes convallis curae facilisis. Vitae diam phasellus litora ad aenean\n" +
                    "himenaeos, magnis malesuada nec metus faucibus, turpis mollis hac lacinia\n" +
                    "lacus. Condimentum dis in sed vel molestie integer, gravida eget volutpat\n" +
                    "interdum bibendum scelerisque magnis, penatibus non sollicitudin convallis\n" +
                    "egestas. Aptent mi ligula conubia justo habitant cubilia tellus curabitur, a nisi\n" +
                    "integer non eget vivamus cursus hac, lacus rutrum ridiculus tempor litora nostra\n" +
                    "dis.\n" +
                    "Nisl pulvinar taciti tellus diam quam dictum cursus potenti euismod natoque\n" +
                    "feugiat mattis ornare tortor, aliquam orci dapibus inceptos id egestas ante viverra\n" +
                    "donec aptent suscipit nulla. Eget nisl fringilla cras felis maecenas nisi ridiculus id\n" +
                    "\n" +
                    "conubia hac primis sem ullamcorper porttitor, rutrum ac sodales ultrices\n" +
                    "vestibulum cum leo semper fusce porta eu fermentum. Proin nisi suspendisse\n" +
                    "class facilisi curabitur quisque, fusce vulputate semper a nulla velit, duis in orci\n" +
                    "faucibus turpis. Risus metus magnis aliquam accumsan laoreet congue per,\n" +
                    "tempus purus et odio senectus sodales vulputate, ligula malesuada dis habitasse\n" +
                    "nullam pellentesque."

        binding.tvTermsAndConditions.setText(ipso)
    }
}