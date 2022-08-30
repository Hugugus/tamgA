package com.example.tamg.ui.lmdc;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.tamg.R;
import com.example.tamg.databinding.FragmentLmdcBinding;
import com.example.tamg.Details;


public class LmdcFragment extends Fragment {

    private LmdcViewModel lmdcViewModel;
    private FragmentLmdcBinding binding;

    public static ImageView image;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        lmdcViewModel =
                new ViewModelProvider(this).get(LmdcViewModel.class);

        binding = FragmentLmdcBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        ImageView info=root.findViewById(R.id.lmdcinfo);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(),Details.class);
                i.putExtra("title","Info");
                i.putExtra("frg","lmdc");
                i.putExtra("content","<p>&nbsp;</p>\n" +
                        "<p>Toute notre &eacute;quipe, vous invite &agrave; d&eacute;couvrir les milles et une saveurs de la fine gastronomie orientale, en revisitant des grands classiques du patrimoine culinaire des pays du Maghreb (Alg&eacute;rie, Maroc et Tunisie) avec des variations cr&eacute;atives et originales.</p>\n" +
                        "<p>Notre carte d&eacute;cline une proposition riche et subtile de mets gourmands, color&eacute;s et &eacute;pic&eacute;s, que nous concoctons avec des produits nobles et de saison choisis avec minutie. Autant de recettes s&eacute;millantes et g&eacute;n&eacute;reuses qui combleront les amateurs de bonne cuisine et autres gastronomes. C&ocirc;t&eacute; cave, une s&eacute;lection ample et pointue de vins r&eacute;f&eacute;renc&eacute;s, qui t&eacute;moignent de la diversit&eacute; et de la complexit&eacute; des terroirs et c&eacute;pages autochtones.</p>\n" +
                        "<p>Crus aux ar&ocirc;mes puissants et raffin&eacute;s, suaves et velout&eacute;s, voire floraux et exotiques, il y en a pour tous les go&ucirc;ts des amoureux de la vigne. Aux commandes de ce palais des d&eacute;lices, Monsieur et Madame Laouichi qui officie depuis plus de 30 ans.</p>\n" +
                        "<p>Situ&eacute; sur la magnifique avenue de la Basilique &agrave; <strong>Bon-secours</strong>, la Maison Du Couscous vous accueille dans un cadre &eacute;l&eacute;gant, raffin&eacute; et convivial, sign&eacute; par l&rsquo;architecte d&rsquo;int&eacute;rieur Monsieur Wallays, r&eacute;f&eacute;rence incontournable en mati&egrave;re d&rsquo;am&eacute;nagement d&rsquo;&eacute;tablissements de restauration en wallonie.</p>\n" +
                        "<p>Ce cr&eacute;ateur d&rsquo;atmosph&egrave;res a con&ccedil;u ici une d&eacute;coration contemporaine et dynamis&eacute;e par les volutes en forme d&rsquo;arabesques prodigu&eacute;es par de majestueux lustres cisel&eacute;s et garnis de vitres multicolores.</p>\n" +
                        "<p>Que ce soit pour un d&icirc;ner d&rsquo;affaires, entre amis, en famille ou en t&ecirc;te-&agrave;-t&ecirc;te, la magie de la Maison Du Couscous mettra tous vos sens en &eacute;bullition.</p>\n" +
                        "<p>&nbsp;</p>\n" +
                        "<p>Voici l'adresse compl&egrave;te de <strong>La Maison du Couscous </strong>:</p>\n" +
                        "<p style=\"padding-left: 40px;\"><p style=\"padding-left: 40px;\"><a href=\"https://www.google.com/maps/place/La+Maison+Du+Couscous+-+Venues+Bar+-+Art+Food/@50.498603,3.605088,16z/data=!4m5!3m4!1s0x0:0x9013334c6d82f4c0!8m2!3d50.4985978!4d3.6050799?hl=fr-FR\" target=\"_blank\"><span style=\"text-decoration: underline; color: #ff9900;\">47 avenue de la Basilique 7603 Bon-Secours</span></a></p>\n" +
                        "<p><strong>Heures d&rsquo;ouverture </strong>:</p>\n" +
                        "<p style=\"padding-left: 40px;\">Nous vous accueillons tous les jours <em><strong>sauf</strong> le mardi et le mercredi </em> en journ&eacute;e de 12h30 &agrave; 14h30 et le soir de 18h &agrave; 22h.</p>");
                getContext().startActivity(i);
            }
        });

        CardView resto=root.findViewById(R.id.lmdcresto);
        resto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(),Details.class);
                i.putExtra("title","Le restaurant");
                i.putExtra("frg","lmdc");

                i.putExtra("content","<article id=\"post-1100\" class=\"post-1100 page type-page status-publish hentry\">"+
                        "<div class=\"entry-content\">\n" +

                        "<div class=\"elementor elementor-1100 elementor-bc-flex-widget\" data-elementor-type=\"wp-post\" data-elementor-id=\"1100\" data-elementor-settings=\"[]\">\n" +
                        "<div class=\"elementor-inner\">\n" +
                        "<div class=\"elementor-section-wrap\">\n" +
                        "<section class=\"elementor-section elementor-top-section elementor-element elementor-element-cb74c83 elementor-section-stretched elementor-section-boxed elementor-section-height-default elementor-section-height-default\" style=\"width: 1440px; left: -150px;\" data-id=\"cb74c83\" data-element_type=\"section\" data-settings=\"{&quot;stretch_section&quot;:&quot;section-stretched&quot;}\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-3475060\" data-id=\"3475060\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-8ee498d elementor-widget elementor-widget-image\" data-id=\"8ee498d\" data-element_type=\"widget\" data-widget_type=\"image.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-5b2df72\" data-id=\"5b2df72\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-1d83219 elementor-widget elementor-widget-heading\" data-id=\"1d83219\" data-element_type=\"widget\" data-widget_type=\"heading.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<h3 class=\"elementor-heading-title elementor-size-default\">La pastilla au poulet mijot&eacute;e &agrave; la Marocaine</h3>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-8ee498d elementor-widget elementor-widget-image\" data-id=\"8ee498d\" data-element_type=\"widget\" data-widget_type=\"image.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-image\"><img class=\"attachment-medium_large size-medium_large\" src=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Pastilla-768x576.jpg\" sizes=\"(max-width: 768px) 100vw, 768px\" srcset=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Pastilla-768x576.jpg 768w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Pastilla-632x474.jpg 632w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Pastilla-700x525.jpg 700w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Pastilla-830x623.jpg 830w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Pastilla-230x173.jpg 230w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Pastilla-350x263.jpg 350w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Pastilla-480x360.jpg 480w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Pastilla.jpg 960w\" alt=\"\" width=\"768\" height=\"576\" /></div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-2ff737b elementor-widget elementor-widget-spacer\" data-id=\"2ff737b\" data-element_type=\"widget\" data-widget_type=\"spacer.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-spacer\">\n" +
                        "<div class=\"elementor-spacer-inner\">&nbsp;</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-f738332 elementor-widget-divider--view-line elementor-widget elementor-widget-divider\" data-id=\"f738332\" data-element_type=\"widget\" data-widget_type=\"divider.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<p>La pastilla est un plat traditionnel constitu&eacute; d&rsquo;une enveloppe en feuilles de brick, une base d&rsquo;oignons, de persil, de coriandre, d&rsquo;&oelig;uf dur et d&rsquo;amandes, ce m&eacute;lange de sucr&eacute; et de sal&eacute; est parfum&eacute; &agrave; la cannelle. Une recette connue originaire de F&egrave;s. Il existe de nombreuses variantes de la Pastilla : aux poissons, au poulet ou &agrave; la viande et m&ecirc;me au poulet et au citron sans amandes ou sans sucre.<p/>\n" +
                        "\n" +
                        "</div>\n" +

                        "</div>\n" +
                        "</section>\n" +
                        "<section class=\"elementor-section elementor-top-section elementor-element elementor-element-ed50105 elementor-section-stretched elementor-section-boxed elementor-section-height-default elementor-section-height-default\" style=\"width: 1440px; left: -150px;\" data-id=\"ed50105\" data-element_type=\"section\" data-settings=\"{&quot;stretch_section&quot;:&quot;section-stretched&quot;}\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-564321a\" data-id=\"564321a\" data-element_type=\"column\" data-settings=\"{&quot;background_background&quot;:&quot;classic&quot;}\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-background-overlay\">&nbsp;</div>\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-0161600 elementor-widget elementor-widget-heading\" data-id=\"0161600\" data-element_type=\"widget\" data-widget_type=\"heading.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<h3 class=\"elementor-heading-title elementor-size-large\">Le Couscous s'est l&rsquo;histoire ancestrale d&rsquo;un grain magique</h3>\n" +
                        "</div>\n" +
                        "</div>\n" +

                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-ad615d4\" data-id=\"ad615d4\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-c3ac42a elementor-widget elementor-widget-image\" data-id=\"c3ac42a\" data-element_type=\"widget\" data-widget_type=\"image.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-image\"><img class=\"attachment-medium_large size-medium_large\" src=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/26230275_2016841785022605_8744477336539442213_n-768x512.jpg\" sizes=\"(max-width: 768px) 100vw, 768px\" srcset=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/26230275_2016841785022605_8744477336539442213_n-768x512.jpg 768w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/26230275_2016841785022605_8744477336539442213_n-632x421.jpg 632w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/26230275_2016841785022605_8744477336539442213_n-700x467.jpg 700w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/26230275_2016841785022605_8744477336539442213_n-830x553.jpg 830w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/26230275_2016841785022605_8744477336539442213_n-230x153.jpg 230w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/26230275_2016841785022605_8744477336539442213_n-350x233.jpg 350w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/26230275_2016841785022605_8744477336539442213_n-480x320.jpg 480w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/26230275_2016841785022605_8744477336539442213_n.jpg 960w\" alt=\"\" width=\"768\" height=\"512\" /></div>\n" +

                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-15faa8d elementor-align-left elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list\" data-id=\"15faa8d\" data-element_type=\"widget\" data-widget_type=\"icon-list.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<p>Le couscous (en berb&egrave;re seksu) est le plat de r&eacute;f&eacute;rence des habitants de l&rsquo;Afrique du Nord. C&rsquo;est aussi leur plus grande et plus belle cr&eacute;ation culinaire. Les Amazigh furent les premiers &agrave; faire cuire &agrave; la vapeur les semoules de bl&eacute; et d&rsquo;orge. Riche en l&eacute;gumes, semoule et viandes diverses, le couscous est &agrave; la fois &eacute;quilibr&eacute;, festif et d&eacute;paysant. Il en existe autant de d&eacute;clinaisons que de r&eacute;gions du Maghreb... A vous d'opter pour la tradition pour faire de votre couscous un plat magique !</p>\n" +
                        "</div>\n" +
                        "<p>&nbsp;</p>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</section>\n" +
                        "<section class=\"elementor-section elementor-top-section elementor-element elementor-element-b1ace1a elementor-section-stretched elementor-section-boxed elementor-section-height-default elementor-section-height-default\" style=\"width: 1440px; left: -150px;\" data-id=\"b1ace1a\" data-element_type=\"section\" data-settings=\"{&quot;stretch_section&quot;:&quot;section-stretched&quot;}\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-96e2007\" data-id=\"96e2007\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-82059f0 elementor-widget elementor-widget-image\" data-id=\"82059f0\" data-element_type=\"widget\" data-widget_type=\"image.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" + "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-ac0bcf1\" data-id=\"ac0bcf1\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-ffa3e67 elementor-widget elementor-widget-heading\" data-id=\"ffa3e67\" data-element_type=\"widget\" data-widget_type=\"heading.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<h2 class=\"elementor-heading-title elementor-size-large\">Le tajine : Le plat traditionnel de la cuisine marocaine</h2>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-image\"><img class=\"attachment-medium_large size-medium_large\" src=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/14-768x1024.jpg\" sizes=\"(max-width: 768px) 100vw, 768px\" srcset=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/14-768x1024.jpg 768w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/14-632x843.jpg 632w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/14-700x934.jpg 700w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/14-230x307.jpg 230w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/14-350x467.jpg 350w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/14-480x640.jpg 480w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/14.jpg 800w\" alt=\"\" width=\"768\" height=\"1024\" /></div>\n" +

                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-0267977 elementor-widget elementor-widget-spacer\" data-id=\"0267977\" data-element_type=\"widget\" data-widget_type=\"spacer.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-spacer\">\n" +
                        "<div class=\"elementor-spacer-inner\">&nbsp;</div>\n" +
                        "<div class=\"elementor-spacer-inner\">Le mot tajine, lorsqu&rsquo;il fait r&eacute;f&eacute;rence &agrave; la nourriture, d&eacute;signe donc les aliments qui ont &eacute;t&eacute; cuits dans le plat tajine. Il existe un tr&egrave;s grand nombre de tajines diff&eacute;rents, qui contiennent de la viande, des l&eacute;gumes et des fruits. Tout d'abord le tajine aux olives, aux coings, aux figues dattes ou abricots), tout cela avec du b&oelig;uf de l&rsquo;agneau ou encore du poulet : il y en a vraiment pour tous les go&ucirc;ts ! Votre restaurant vous proposent &eacute;galement le tajine v&eacute;g&eacute;tarien, v&eacute;gane ou encore le Sans Gluten. Les aliments cuits dans ce un plat &agrave; tajine sont particuli&egrave;rement fondants et savoureux, pour le plus grand plaisir des gourmands.</div>\n" +
                        "</div>\n" +
                        "<p>&nbsp;</p>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +

                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-5af8755\" data-id=\"5af8755\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-66ae323 elementor-widget elementor-widget-image\" data-id=\"66ae323\" data-element_type=\"widget\" data-widget_type=\"image.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</section>\n" +
                        "<section class=\"elementor-section elementor-top-section elementor-element elementor-element-7ac2176 elementor-section-stretched elementor-section-boxed elementor-section-height-default elementor-section-height-default\" style=\"width: 1440px; left: -150px;\" data-id=\"7ac2176\" data-element_type=\"section\" data-settings=\"{&quot;stretch_section&quot;:&quot;section-stretched&quot;}\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-a3655c0\" data-id=\"a3655c0\" data-element_type=\"column\" data-settings=\"{&quot;background_background&quot;:&quot;classic&quot;}\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-e71705d elementor-widget elementor-widget-heading\" data-id=\"e71705d\" data-element_type=\"widget\" data-widget_type=\"heading.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<h2 class=\"elementor-heading-title elementor-size-large\">Une s&eacute;lection des vins qui accompagne les saveurs</h2>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-image\"><img class=\"attachment-medium_large size-medium_large\" src=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/23659215_1943058652400919_3030924462861929971_n-768x769.jpg\" sizes=\"(max-width: 768px) 100vw, 768px\" srcset=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/23659215_1943058652400919_3030924462861929971_n-768x769.jpg 768w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/23659215_1943058652400919_3030924462861929971_n-632x633.jpg 632w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/23659215_1943058652400919_3030924462861929971_n-700x701.jpg 700w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/23659215_1943058652400919_3030924462861929971_n-830x831.jpg 830w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/23659215_1943058652400919_3030924462861929971_n-230x230.jpg 230w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/23659215_1943058652400919_3030924462861929971_n-350x350.jpg 350w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/23659215_1943058652400919_3030924462861929971_n-480x481.jpg 480w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/23659215_1943058652400919_3030924462861929971_n-600x600.jpg 600w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/23659215_1943058652400919_3030924462861929971_n.jpg 958w\" alt=\"\" width=\"768\" height=\"769\" /></div>\n" +
                        "<p>&nbsp;</p>"+

                        "</div>\n" +

                        "<div class=\"elementor-element elementor-element-2df15c7 elementor-widget-divider--view-line elementor-widget elementor-widget-divider\" data-id=\"2df15c7\" data-element_type=\"widget\" data-widget_type=\"divider.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-divider\">Notre carte des vins qui s&rsquo;&eacute;toffe au fur et &agrave; mesure de nos d&eacute;couvertes et nos coups de c&oelig;ur. Durant le repas, nos serveurs se feront un plaisir de vous pr&eacute;senter une s&eacute;lection de vins en accord avec vos plats.</div>\n" +
                        "<p>&nbsp;</p>\n" +
                                "<p><strong>Lien vers <a href=\"https://www.lamaisonducouscous.be/wp-content/uploads/2015/03/Menu-copie.pdf\" >la carte compl&egrave;te du restaurant&nbsp;</a></strong></p>\n"+
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +

                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +

                        "</article>");
                getContext().startActivity(i);
            }
        });

        CardView bar=root.findViewById(R.id.lmdcbar);
        bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(),Details.class);
                i.putExtra("title","Venues bar");
                i.putExtra("frg","lmdc");

                i.putExtra("content","<article id=\"post-847\" class=\"post-847 page type-page status-publish hentry\"><header class=\"entry-header\"></header>\n" +
                        "<div class=\"entry-content\">\n" +
                        "<div class=\"elementor elementor-847 elementor-bc-flex-widget\" data-elementor-type=\"wp-post\" data-elementor-id=\"847\" data-elementor-settings=\"[]\">\n" +
                        "<div class=\"elementor-inner\">\n" +
                        "<div class=\"elementor-section-wrap\">\n" +
                        "<section class=\"elementor-section elementor-top-section elementor-element elementor-element-ed50105 elementor-section-stretched elementor-section-boxed elementor-section-height-default elementor-section-height-default\" style=\"width: 1440px; left: -150px;\" data-id=\"ed50105\" data-element_type=\"section\" data-settings=\"{&quot;stretch_section&quot;:&quot;section-stretched&quot;}\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-564321a\" data-id=\"564321a\" data-element_type=\"column\" data-settings=\"{&quot;background_background&quot;:&quot;classic&quot;}\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-0161600 elementor-widget elementor-widget-heading\" data-id=\"0161600\" data-element_type=\"widget\" data-widget_type=\"heading.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<h2 class=\"elementor-heading-title elementor-size-default\">Nos cocktails</h2>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-751e5c1 elementor-widget-divider--view-line elementor-widget elementor-widget-divider\" data-id=\"751e5c1\" data-element_type=\"widget\" data-widget_type=\"divider.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<section class=\"elementor-section elementor-inner-section elementor-element elementor-element-323f813 elementor-section-boxed elementor-section-height-default elementor-section-height-default\" data-id=\"323f813\" data-element_type=\"section\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-inner-column elementor-element elementor-element-59435d1\" data-id=\"59435d1\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-image\"><img class=\"attachment-medium_large size-medium_large\" src=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/AdobeStock_107684458-768x512.jpeg\" sizes=\"(max-width: 768px) 100vw, 768px\" srcset=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/AdobeStock_107684458-768x512.jpeg 768w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/AdobeStock_107684458-632x421.jpeg 632w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/AdobeStock_107684458-700x467.jpeg 700w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/AdobeStock_107684458-830x553.jpeg 830w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/AdobeStock_107684458-230x153.jpeg 230w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/AdobeStock_107684458-350x233.jpeg 350w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/AdobeStock_107684458-480x320.jpeg 480w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/AdobeStock_107684458-1320x880.jpeg 1320w\" alt=\"\" width=\"768\" height=\"512\" /></div>\n" +

                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-dfd58ff elementor-widget elementor-widget-text-editor\" data-id=\"dfd58ff\" data-element_type=\"widget\" data-widget_type=\"text-editor.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-text-editor elementor-clearfix\">\n" +
                        "<p>Le Bar Lounge, c&rsquo;est un espace bar &agrave; cocktails sur Bon-Secours, Vos bartenders vous propose aussi bien de d&eacute;guster des cr&eacute;ations propos&eacute;es sur une carte originale que des grands classiques. Notre exp&eacute;rience derri&egrave;re le bar, nous permet &agrave; ce jour, de satisfaire toutes vos demandes. N&rsquo;h&eacute;sitez pas &agrave; nous faire confiance pour la d&eacute;gustation de vos futurs cocktails !</p>\n" +
                        "</div>" +
                        "</div>" +
                        "</div>" +
                        "</div>" +
                        "</div>" +
                        "</div>" +
                        "<div class=\"elementor-column elementor-col-50 elementor-inner-column elementor-element elementor-element-ad04e0e\" data-id=\"ad04e0e\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</section>\n" +
                        "<section class=\"elementor-section elementor-top-section elementor-element elementor-element-b1ace1a elementor-section-stretched elementor-section-boxed elementor-section-height-default elementor-section-height-default\" style=\"width: 1440px; left: -150px;\" data-id=\"b1ace1a\" data-element_type=\"section\" data-settings=\"{&quot;stretch_section&quot;:&quot;section-stretched&quot;}\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-96e2007\" data-id=\"96e2007\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-82059f0 elementor-widget elementor-widget-image\" data-id=\"82059f0\" data-element_type=\"widget\" data-widget_type=\"image.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-ac0bcf1\" data-id=\"ac0bcf1\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-ffa3e67 elementor-widget elementor-widget-heading\" data-id=\"ffa3e67\" data-element_type=\"widget\" data-widget_type=\"heading.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<h2 class=\"elementor-heading-title elementor-size-default\"><br />NOS SPIRITUEUX</h2>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-0267977 elementor-widget elementor-widget-spacer\" data-id=\"0267977\" data-element_type=\"widget\" data-widget_type=\"spacer.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-spacer\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-75544eb elementor-widget-divider--view-line elementor-widget elementor-widget-divider\" data-id=\"75544eb\" data-element_type=\"widget\" data-widget_type=\"divider.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-image\"><img class=\"attachment-medium_large size-medium_large\" src=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/48419945_2633556346684476_6272743841103609856_n.jpg\" sizes=\"(max-width: 720px) 100vw, 720px\" srcset=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/48419945_2633556346684476_6272743841103609856_n.jpg 720w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/48419945_2633556346684476_6272743841103609856_n-632x843.jpg 632w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/48419945_2633556346684476_6272743841103609856_n-700x933.jpg 700w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/48419945_2633556346684476_6272743841103609856_n-230x307.jpg 230w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/48419945_2633556346684476_6272743841103609856_n-350x467.jpg 350w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/48419945_2633556346684476_6272743841103609856_n-480x640.jpg 480w\" alt=\"\" width=\"720\" height=\"960\" /></div>\n" +

                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-5365fbb elementor-widget elementor-widget-text-editor\" data-id=\"5365fbb\" data-element_type=\"widget\" data-widget_type=\"text-editor.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-text-editor elementor-clearfix\">\n" +
                        "<p>Nous vous proposons une s&eacute;lection de 60 spiritueux diff&eacute;rents.</p>\n" +
                        "<p>Les spiritueux sont s&eacute;lectionn&eacute;s avec soins pour votre plus grand plaisir !</p>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</section>\n" +
                        "<section class=\"elementor-section elementor-top-section elementor-element elementor-element-7ac2176 elementor-section-stretched elementor-section-boxed elementor-section-height-default elementor-section-height-default\" style=\"width: 1440px; left: -150px;\" data-id=\"7ac2176\" data-element_type=\"section\" data-settings=\"{&quot;stretch_section&quot;:&quot;section-stretched&quot;}\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-a3655c0\" data-id=\"a3655c0\" data-element_type=\"column\" data-settings=\"{&quot;background_background&quot;:&quot;classic&quot;}\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-3ad13e3 elementor-widget elementor-widget-heading\" data-id=\"3ad13e3\" data-element_type=\"widget\" data-widget_type=\"heading.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<h2 class=\"elementor-heading-title elementor-size-default\"><br />NOS TAPAS</h2>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-image\"><img class=\"attachment-medium_large size-medium_large\" src=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/37369307_2149419561739726_6979470496228179968_n-768x512.jpg\" sizes=\"(max-width: 768px) 100vw, 768px\" srcset=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/37369307_2149419561739726_6979470496228179968_n-768x512.jpg 768w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/37369307_2149419561739726_6979470496228179968_n-632x421.jpg 632w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/37369307_2149419561739726_6979470496228179968_n-700x467.jpg 700w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/37369307_2149419561739726_6979470496228179968_n-830x553.jpg 830w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/37369307_2149419561739726_6979470496228179968_n-230x153.jpg 230w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/37369307_2149419561739726_6979470496228179968_n-350x233.jpg 350w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/37369307_2149419561739726_6979470496228179968_n-480x320.jpg 480w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/37369307_2149419561739726_6979470496228179968_n-1320x880.jpg 1320w\" alt=\"\" width=\"768\" height=\"512\" /></div>\n" +

                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-2df15c7 elementor-widget-divider--view-line elementor-widget elementor-widget-divider\" data-id=\"2df15c7\" data-element_type=\"widget\" data-widget_type=\"divider.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<section class=\"elementor-section elementor-inner-section elementor-element elementor-element-82600da elementor-section-boxed elementor-section-height-default elementor-section-height-default\" data-id=\"82600da\" data-element_type=\"section\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-inner-column elementor-element elementor-element-e4be99c\" data-id=\"e4be99c\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-6859193 elementor-widget elementor-widget-text-editor\" data-id=\"6859193\" data-element_type=\"widget\" data-widget_type=\"text-editor.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-text-editor elementor-clearfix\"><br />Pour accompagner vos drinks, nous vous proposons &eacute;galement une carte compos&eacute;e de plusieurs tapas. Convivialit&eacute; et simplicit&eacute; sont &agrave; l&rsquo;ordre du jour !</div>\n" +
                        "</div>\n" +

                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-inner-column elementor-element elementor-element-97034b4\" data-id=\"97034b4\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</section>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-5af8755\" data-id=\"5af8755\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-66ae323 elementor-widget elementor-widget-image\" data-id=\"66ae323\" data-element_type=\"widget\" data-widget_type=\"image.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</section>\n" +
                        "<section class=\"elementor-section elementor-top-section elementor-element elementor-element-5fceed3 elementor-section-stretched elementor-section-boxed elementor-section-height-default elementor-section-height-default\" style=\"width: 1440px; left: -150px;\" data-id=\"5fceed3\" data-element_type=\"section\" data-settings=\"{&quot;stretch_section&quot;:&quot;section-stretched&quot;}\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-b6107b8\" data-id=\"b6107b8\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-defb3c1 elementor-widget elementor-widget-image\" data-id=\"defb3c1\" data-element_type=\"widget\" data-widget_type=\"image.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-8b9ddf5\" data-id=\"8b9ddf5\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-a00e311 elementor-widget elementor-widget-heading\" data-id=\"a00e311\" data-element_type=\"widget\" data-widget_type=\"heading.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<h2 class=\"elementor-heading-title elementor-size-default\"><br />Nos Mocktails</h2>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-image\"><img class=\"attachment-medium_large size-medium_large\" src=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Mocktail-.jpg\" sizes=\"(max-width: 720px) 100vw, 720px\" srcset=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Mocktail-.jpg 720w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Mocktail--632x843.jpg 632w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Mocktail--700x933.jpg 700w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Mocktail--230x307.jpg 230w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Mocktail--350x467.jpg 350w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/Mocktail--480x640.jpg 480w\" alt=\"\" width=\"720\" height=\"960\" /></div>\n" +

                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-82f8ecf elementor-widget elementor-widget-spacer\" data-id=\"82f8ecf\" data-element_type=\"widget\" data-widget_type=\"spacer.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-spacer\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-fc66ab9 elementor-widget-divider--view-line elementor-widget elementor-widget-divider\" data-id=\"fc66ab9\" data-element_type=\"widget\" data-widget_type=\"divider.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-9037c41 elementor-widget elementor-widget-text-editor\" data-id=\"9037c41\" data-element_type=\"widget\" data-widget_type=\"text-editor.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-text-editor elementor-clearfix\"><br />Le mocktail est l&rsquo;alternative non alcoolis&eacute;e du cocktail. Vos Barmans vous proposerons une combinaisons de saveurs par exemple la framboise et la pomme, ou l&rsquo;orange et une touche d&rsquo;ananas. Certains pr&eacute;f&eacute;reront quant &agrave; eux du jus de lime parfum&eacute; &agrave; la menthe. Les possibilit&eacute;s sont infinies et il y en a pour tous les go&ucirc;ts.&nbsp; Nous vous proposerons une version mocktail du mojito en pr&eacute;parant ce c&eacute;l&egrave;bre cocktail sans rhum ou encore le &laquo;&nbsp;Virgin Ap&eacute;rol Spritz&nbsp;&raquo;.</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</section>\n" +
                        "<section class=\"elementor-section elementor-top-section elementor-element elementor-element-61af820 elementor-section-stretched elementor-section-boxed elementor-section-height-default elementor-section-height-default\" style=\"width: 1440px; left: -150px;\" data-id=\"61af820\" data-element_type=\"section\" data-settings=\"{&quot;stretch_section&quot;:&quot;section-stretched&quot;}\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-b826dd8\" data-id=\"b826dd8\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<section class=\"elementor-section elementor-inner-section elementor-element elementor-element-2e29306 elementor-section-boxed elementor-section-height-default elementor-section-height-default\" data-id=\"2e29306\" data-element_type=\"section\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-inner-column elementor-element elementor-element-05c92c4\" data-id=\"05c92c4\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-38edbb4 elementor-widget elementor-widget-image\" data-id=\"38edbb4\" data-element_type=\"widget\" data-widget_type=\"image.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-inner-column elementor-element elementor-element-09d2970\" data-id=\"09d2970\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-5d7f7b3 elementor-widget elementor-widget-text-editor\" data-id=\"5d7f7b3\" data-element_type=\"widget\" data-widget_type=\"text-editor.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-text-editor elementor-clearfix\">&nbsp;</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-16e841a elementor-widget elementor-widget-heading\" data-id=\"16e841a\" data-element_type=\"widget\" data-widget_type=\"heading.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<h4 class=\"elementor-heading-title elementor-size-default\">Elix Singapore Sling</h4>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-image\"><img class=\"attachment-large size-large\" src=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/elixir.png\" sizes=\"(max-width: 475px) 100vw, 475px\" srcset=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/elixir.png 475w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/elixir-230x230.png 230w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/elixir-350x350.png 350w\" alt=\"\" width=\"475\" height=\"475\" /></div>\n" +

                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-0c13d37 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list\" data-id=\"0c13d37\" data-element_type=\"widget\" data-widget_type=\"icon-list.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<ul class=\"elementor-icon-list-items\">\n" +
                        "<li class=\"elementor-icon-list-item\"><span class=\"elementor-icon-list-text\">Vodka Absolut Elyx</span></li>\n" +
                        "<li class=\"elementor-icon-list-item\"><span class=\"elementor-icon-list-text\">SuperCassis Vedrenne</span></li>\n" +
                        "<li class=\"elementor-icon-list-item\"><span class=\"elementor-icon-list-text\">Chambord</span></li>\n" +
                        "<li class=\"elementor-icon-list-item\"><span class=\"elementor-icon-list-text\">Cointreau Noir</span></li>\n" +
                        "<li class=\"elementor-icon-list-item\"><span class=\"elementor-icon-list-text\">B&eacute;n&eacute;dictine</span></li>\n" +
                        "<li class=\"elementor-icon-list-item\"><span class=\"elementor-icon-list-text\">Jus de framboise</span></li>\n" +
                        "<li class=\"elementor-icon-list-item\"><span class=\"elementor-icon-list-text\">Citron jaune</span></li>\n" +
                        "<li class=\"elementor-icon-list-item\"><span class=\"elementor-icon-list-text\">Suze Aromatic Bitters </span></li>\n" +
                        "</ul>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</section>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-27800ba\" data-id=\"27800ba\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<section class=\"elementor-section elementor-inner-section elementor-element elementor-element-4526308 elementor-section-boxed elementor-section-height-default elementor-section-height-default\" data-id=\"4526308\" data-element_type=\"section\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-inner-column elementor-element elementor-element-47eeace\" data-id=\"47eeace\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-ad88581 elementor-widget elementor-widget-image\" data-id=\"ad88581\" data-element_type=\"widget\" data-widget_type=\"image.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-inner-column elementor-element elementor-element-d0bec8f\" data-id=\"d0bec8f\" data-element_type=\"column\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-9ba793e elementor-widget elementor-widget-heading\" data-id=\"9ba793e\" data-element_type=\"widget\" data-widget_type=\"heading.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<h4 class=\"elementor-heading-title elementor-size-default\"><br /><br />Marocan Tajin</h4>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-image\"><img class=\"attachment-large size-large\" src=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/marocantajin.jpg\" sizes=\"(max-width: 475px) 100vw, 475px\" srcset=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/marocantajin.jpg 475w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/marocantajin-230x230.jpg 230w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/marocantajin-350x350.jpg 350w\" alt=\"\" width=\"475\" height=\"475\" /></div>\n" +

                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-cf13124 elementor-icon-list--layout-traditional elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list\" data-id=\"cf13124\" data-element_type=\"widget\" data-widget_type=\"icon-list.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<ul class=\"elementor-icon-list-items\">\n" +
                        "<li class=\"elementor-icon-list-item\"><span class=\"elementor-icon-list-text\">Wisky Jameson Black Barrel infus&eacute; aux raisins Sec</span></li>\n" +
                        "<li class=\"elementor-icon-list-item\"><span class=\"elementor-icon-list-text\">Liqueur Hedonis</span></li>\n" +
                        "<li class=\"elementor-icon-list-item\"><span class=\"elementor-icon-list-text\">Pur&eacute;e d&rsquo;abricot</span></li>\n" +
                        "<li class=\"elementor-icon-list-item\"><span class=\"elementor-icon-list-text\">Sirop de corne de Gazelle </span></li>\n" +
                        "<li class=\"elementor-icon-list-item\"><span class=\"elementor-icon-list-text\">Marocan Bitters</span></li>\n" +
                        "</ul>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</section>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</section>\n" +
                        "<section class=\"elementor-section elementor-top-section elementor-element elementor-element-7cd21b5 elementor-section-stretched elementor-section-boxed elementor-section-height-default elementor-section-height-default\" style=\"width: 1440px; left: -150px;\" data-id=\"7cd21b5\" data-element_type=\"section\" data-settings=\"{&quot;stretch_section&quot;:&quot;section-stretched&quot;}\">\n" +
                        "<div class=\"elementor-container elementor-column-gap-default\">\n" +
                        "<div class=\"elementor-row\">\n" +
                        "<div class=\"elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-f092f0a\" data-id=\"f092f0a\" data-element_type=\"column\" data-settings=\"{&quot;background_background&quot;:&quot;classic&quot;}\">\n" +
                        "<div class=\"elementor-column-wrap elementor-element-populated\">\n" +
                        "<div class=\"elementor-background-overlay\">&nbsp;</div>\n" +
                        "<div class=\"elementor-widget-wrap\">\n" +
                        "<div class=\"elementor-element elementor-element-28654a4 elementor-widget elementor-widget-heading\" data-id=\"28654a4\" data-element_type=\"widget\" data-widget_type=\"heading.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<h3 class=\"elementor-heading-title elementor-size-default\"><br /><br />Des Caraibes A chicken Itza</h3>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-image\"><img class=\"attachment-medium_large size-medium_large\" src=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/caraibes.png\" sizes=\"(max-width: 475px) 100vw, 475px\" srcset=\"https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/caraibes.png 475w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/caraibes-230x230.png 230w, https://www.lamaisonducouscous.be/wp-content/uploads/2019/02/caraibes-350x350.png 350w\" alt=\"\" width=\"475\" height=\"475\" /></div>\n" +

                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-0b5fc1b elementor-widget-divider--view-line elementor-widget elementor-widget-divider\" data-id=\"0b5fc1b\" data-element_type=\"widget\" data-widget_type=\"divider.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<div class=\"elementor-divider\">&nbsp;</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div class=\"elementor-element elementor-element-c7d26ae elementor-icon-list--layout-inline elementor-list-item-link-full_width elementor-widget elementor-widget-icon-list\" data-id=\"c7d26ae\" data-element_type=\"widget\" data-widget_type=\"icon-list.default\">\n" +
                        "<div class=\"elementor-widget-container\">\n" +
                        "<ul class=\"elementor-icon-list-items elementor-inline-items\">\n" +
                        "<li class=\"elementor-icon-list-item elementor-inline-item\"><span class=\"elementor-icon-list-text\">Rum Sailor Jerry </span></li>\n" +
                        "<li class=\"elementor-icon-list-item elementor-inline-item\"><span class=\"elementor-icon-list-text\">Mezcal Koch 100% Espadin </span></li>\n" +
                        "<li class=\"elementor-icon-list-item elementor-inline-item\"><span class=\"elementor-icon-list-text\">Jus d&rsquo;ananas Frais </span></li>\n" +
                        "<li class=\"elementor-icon-list-item elementor-inline-item\"><span class=\"elementor-icon-list-text\">Miel </span></li>\n" +
                        "<li class=\"elementor-icon-list-item elementor-inline-item\"><span class=\"elementor-icon-list-text\">Jus de citron </span></li>\n" +
                        "<li class=\"elementor-icon-list-item elementor-inline-item\"><span class=\"elementor-icon-list-text\">Sauge fraiche </span></li>\n" +
                        "<li class=\"elementor-icon-list-item elementor-inline-item\"><span class=\"elementor-icon-list-text\">Elixir De Longue Vie </span></li>\n" +
                        "<li class=\"elementor-icon-list-item elementor-inline-item\"><span class=\"elementor-icon-list-text\">Vodka Zubrowka Original Infus&eacute;e &agrave; l&rsquo;aneth</span></li>\n" +
                        "<li class=\"elementor-icon-list-item elementor-inline-item\"><span class=\"elementor-icon-list-text\">Absenteroux Vermouth &agrave; l&rsquo;absinthe </span></li>\n" +
                        "<li class=\"elementor-icon-list-item elementor-inline-item\"><span class=\"elementor-icon-list-text\">Schweppes Premuim Mixer Machta </span></li>\n" +
                        "<li class=\"elementor-icon-list-item elementor-inline-item\"><span class=\"elementor-icon-list-text\">Chartreuse Jaune </span></li>\n" +
                        "<li class=\"elementor-icon-list-item elementor-inline-item\"><span class=\"elementor-icon-list-text\">Jus de citron </span></li>\n" +
                        "</ul>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</article>");
                getContext().startActivity(i);
            }
        });
        CardView event=root.findViewById(R.id.lmdcevent);
        LinearLayout reservation=root.findViewWithTag(R.id.lmdcreserv);
        LinearLayout shop=root.findViewWithTag(R.id.lmdcshop);
        CardView contact=root.findViewById(R.id.lmdccontact);









       /* //animation image
        ArrayList imageList=new ArrayList<>();
        imageList.add(R.drawable.a2);
        imageList.add(R.drawable.a3);
        imageList.add(R.drawable.a4);
        imageList.add(R.drawable.a5);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {
            int i = 0;
            public void run()
            {
                int z= (int) imageList.get(i);
                //TranslateAnimation animate = new TranslateAnimation(image.getX(), image.getX()+image.getX(), 0, 0);
                //animate.setDuration(2000);
                //animate.setFillAfter(true);
                //image.startAnimation(animate);
                DisplayMetrics outMetrics = new DisplayMetrics();

                getActivity().getWindowManager().getDefaultDisplay().getMetrics(outMetrics);

                TranslateAnimation imageAnimation = new TranslateAnimation(outMetrics.widthPixels, 0, 0, 0);
                imageAnimation.setDuration(1500);

                image.startAnimation(imageAnimation);
                image.setImageResource(z);

                i++;
                if (i > imageList.size() - 1)
                {
                    i = 0;
                }
                handler.postDelayed(this, 4000);
            }
        }, 4000);*/


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}