package com.kiwisudhakar.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.TimeUnit;

/**
 * Created by aniket on 12/23/17.
 */

public class AsyncTaskTest extends AndroidTestCase {

    public void testNonEmptyJokeReceived() {
        try {
            EndpointsAsyncTask task = new EndpointsAsyncTask();
            task.execute();
            String joke = task.get(30, TimeUnit.SECONDS);

            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (Exception e) {
            fail("Operation timed out");
        }

    }
}