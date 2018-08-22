(ns rock-paper-scissors.core-test
  (:require [cljs.test :as t :include-macros true]
            [rock-paper-scissors.rps :as sut]))

(t/deftest test-fight
  (t/testing "rock-paper-scissors"
    (t/is (= ::sut/win (sut/fight ::sut/rock ::sut/scissors)))))
