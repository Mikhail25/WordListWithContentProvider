package com.android.example.wordlistsqlwithcontentprovider;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.provider.BaseColumns;

public final class Contract {
    public static final String DATABASE_NAME = "wordlist";

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty private constructor. This is a standard pattern.
    private Contract() {

    }


    public static abstract class WordList implements BaseColumns {
        public static final String WORD_LIST_TABLE = "word_entries";

        // Column names...
        public static final String KEY_ID = "_id";
        public static final String KEY_WORD = "word";
    }

    public static final int ALL_ITEMS = -2;
    public static final String COUNT = "count";

    // Customarily, to make Authority unique, it's the package name extended with "provider".
    // Must match with the authority defined in Android Manifest.
    public static final String AUTHORITY =
            "com.android.example.wordlistsqlwithcontentprovider.provider";

    // The content path is an abstract semantic identifier of the data you are interested in.
    // It does not predict or presume in what form the data is stored or organized in the
    // background. As such, "words" could resolve into the name of a table, the name of a file,
    // or in this example, the name of a list.
    public static final String CONTENT_PATH = "words";

    // A content:// style URI to the authority for this table */
    public static final Uri CONTENT_URI =
            Uri.parse("content://" + AUTHORITY + "/" + CONTENT_PATH);
    public static final Uri ROW_COUNT_URI =
            Uri.parse("content://" + AUTHORITY + "/" + CONTENT_PATH + "/" + COUNT);

    static final String SINGLE_RECORD_MIME_TYPE =
            "vnd.android.cursor.item/vnd.com.example.provider.words";

    static final String MULTIPLE_RECORDS_MIME_TYPE =
            "vnd.android.cursor.item/vnd.com.example.provider.words";

}
