package com.example.thesstour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String history = "Η Θεσσαλονίκη είναι η μεγαλύτερη σε έκταση και πληθυσμό πόλη της Μακεδονίας στη βόρεια Ελλάδα και η δεύτερη μεγαλύτερη της χώρας, μετά την πρωτεύουσα Αθήνα. Αποτελεί την έδρα του δήμου Θεσσαλονίκης και την πρωτεύουσα της Περιφερειακής Ενότητας Θεσσαλονίκης, της μητροπολιτικής περιοχής της Θεσσαλονίκης καθώς και την έδρα της Περιφέρειας Κεντρικής Μακεδονίας και της Αποκεντρωμένης Διοίκησης Μακεδονίας - Θράκης.\n" +
            "\n" +
            "Ιδρύθηκε το 316/5 π.Χ. από το Μακεδόνα στρατηγό Κάσσανδρο, που της έδωσε το όνομα της συζύγου του και ετεροθαλούς αδελφής του Μεγάλου Αλεξάνδρου, Θεσσαλονίκης και προήλθε από τη συνένωση 26 πολιχνών που βρίσκονταν γύρω από τον Θερμαϊκό κόλπο. Τον 2ο π.Χ. αιώνα η πόλη κατακτήθηκε από τους Ρωμαίους και αποτέλεσε έδρα της ρωμαϊκής επαρχίας της Μακεδονίας.\n" +
            "\n" +
            "Εξαιτίας της στρατηγικής της θέσης η πόλη επελέγη ως αυτοκρατορική πρωτεύουσα στα χρόνια της βασιλείας του Γαλέριου, ο οποίος έκτισε στη Θεσσαλονίκη ένα αυτοκρατορικό παλάτι. Μετά την ολοκλήρωση της Εγνατίας οδού (120 π.Χ.) η Θεσσαλονίκη που ήταν η πολυπληθέστερη πόλη του δικτύου με διεθνή ακτινοβολία, έγινε ο σημαντικότερος κόμβος ανάμεσα στην Ανατολή και τη Δύση. Μετά την διαίρεση της Ρωμαϊκής Αυτοκρατορίας ήταν μία από τις υποψήφιες πρωτεύουσες της Ανατολικής Ρωμαϊκής Αυτοκρατορίας, για να επιλεγεί τελικά το Βυζάντιο. Παρά την μη επιλογή της ως πρωτεύουσα, απέκτησε τον τίτλο της «συμβασιλεύουσας» πόλης, με τον οποίο ήταν γνωστή κατά τον Β΄ Παγκόσμιο Πόλεμο και την Βυζαντινή Αυτοκρατορία.\n" +
            "\n" +
            "Μετά την άλωσή της από τους Οθωμανούς το 1432 παρέμεινε στην Οθωμανική Αυτοκρατορία για περίπου πέντε αιώνες. Μετά την εκδίωξη των Εβραίων κυρίως από την Ιβηρική Χερσόνησο το 1492 με την έκδοση του διατάγματος της Αλάμπρα, αλλά και από την Βόρεια Ευρώπη, η Θεσσαλονίκη αποτέλεσε τον προορισμό τους, αποκτώντας έτσι την δική της εβραϊκή κοινότητα.[1] Η εγκατάσταση των Εβραίων στη Θεσσαλονίκη ανέδειξε την πόλη ως τη σημαντικότερη παγκοσμίως εβραϊκή μητρόπολη μέχρι τουλάχιστον τις αρχές του 20ού αιώνα.\n" +
            "\n" +
            "Ιδιαίτερα από τα μέσα του 19ου αιώνα, η πόλη υπήρξε το πλέον κοσμοπολίτικο και πολυπολιτισμικό αστικοποιημένο κέντρο της Οθωμανικής Αυτοκρατορίας και ο σημαντικότερος πόλος πολιτικών κινήσεων και κινημάτων που συνάντησε στην μακρόχρονη ιστορία της.\n" +
            "\n" +
            "Με την ένταξή της στον κορμό του Ελληνικού Κράτους το 1912, ο πληθυσμός της πόλης παρουσίασε σημαντικές μεταβολές, όπως με τη Μικρασιατική Καταστροφή και την εγκατάσταση των Ελλήνων Μικρασιατών προσφύγων και ακολούθως - κατά την Ανταλλαγή Πληθυσμών - με την απομάκρυνση του μουσουλμανικού πληθυσμού και την αντικατάστασή του από προσφυγικούς πληθυσμούς της Μικράς Ασίας, της Ανατολικής Θράκης και του Πόντου.\n" +
            "\n" +
            "Οι πληθυσμιακές μεταβολές συνέτειναν στην αλλαγή της πληθυσμιακής κατάστασης της πόλης με ενίσχυση του ελληνικού στοιχείου.\n" +
            "\n" +
            "Η πολεοδομική και αρχιτεκτονική της αναδιοργάνωση επιταχύνθηκε από την Μεγάλη Πυρκαγιά του 1917 και τις προσπάθειες της νέας ελληνικής διοίκησης να προσθέσει αρχαιοελληνικά και ευρωπαϊκά στοιχεία στο αρχιτεκτονικό ύφος της πόλης, γεγονός που οδήγησε στην καταστροφή αρκετών οθωμανικών λατρευτικών και λειτουργικών κτηρίων. Οι σημαντικότερες πληθυσμιακές μεταβολές παρατηρούνται με την εγκατάσταση του μικρασιατικού και θρακικού προσφυγικού πληθυσμού έπειτα από την Μικρασιατική Καταστροφή το 1922, με το Ολοκαύτωμα της ακμάζουσας εβραϊκής κοινότητας από τα ναζιστικά στρατεύματα την περίοδο της τριπλής κατοχής κατά τον Β΄ Παγκόσμιο Πόλεμο καθώς και με την αστυφιλία που παρατηρείται κατά την δεκαετία του '50 και μεταγενέστερα και οδηγεί σε εσωτερική μετανάστευση προς τα μεγάλα αστικά κέντρα.\n" +
            "\n" +
            "Από την ίδρυσή της από τον Κάσσανδρο, η Θεσσαλονίκη ως μια ακμάζουσα ελληνιστική πόλη, μέχρι την εποχή της οθωμανικής κυριαρχίας αξιοποιεί την στρατηγική της θέση και αναπτύσσεται σε μια πολυπολιτισμική πόλη. Από το 1912, με τη λήξη των Βαλκανικών Πολέμων και την ενσωμάτωση της περιοχής στο σύγχρονο Ελληνικό Κράτος, η Θεσσαλονίκη αποτελεί την δεύτερη σε πληθυσμό πόλη της Ελλάδας. Συχνά αναφέρεται ως η συμπρωτεύουσα της Ελλάδας. Ο πληθυσμός του Πολεοδομικού Συγκροτήματος (ΠΣΘ) υπολογίζεται σε 788.191 κατοίκους, κατά την (Απογραφή του 2011). Ο πληθυσμός της μητροπολιτικής περιοχής ανέρχεται σε 1.012.013 κατοίκους[2] ενώ εκείνος της περιφερειακής ενότητας (πρώην νομού) σε 1.110.912 κατοίκους.";

    private TextView thessalonikiHistory;

    private Button menu;

    private ImageView skg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = findViewById(R.id.menu);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printText();
            }
        });

        thessalonikiHistory = findViewById(R.id.skgHistory);

        thessalonikiHistory.setText("" + history);
    }

    private void printText() {
        Toast.makeText(this, "Nothing to Show yet.", Toast.LENGTH_LONG).show();
    }
}
