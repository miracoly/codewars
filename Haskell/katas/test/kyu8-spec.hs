module Main where

import Codewars.Kyu8

import Test.Hspec
import Test.QuickCheck
import Control.Exception (evaluate)

import System.Exit (exitFailure)

main = hspec $ do
  describe "Test makeNegative" $ do
    it "makes positive Numbers negative" $ do
      makeNegative (1) `shouldBe` (-1)
      makeNegative (37) `shouldBe` (-37)
    it "do not change negativ number" $ do
      makeNegative (-9) `shouldBe` (-9)
      makeNegative (-921) `shouldBe` (-921)

  describe "Test boolToWord" $ do
    it "returns Yes" $ do
      boolToWord True `shouldBe` "Yes"
    it "returns No" $ do
      boolToWord False `shouldBe` "No"

  describe "Test repeatStr" $ do
    it "returns YesYesYes" $ do
      repeatStr 3 "Yes" `shouldBe` "YesYesYes"
    it "returns No" $ do
      repeatStr 1 "No" `shouldBe` "No"
    it "returns empty String" $ do
      repeatStr 0 "No" `shouldBe` ""
    it "returns empty String" $ do
      repeatStr 0 "" `shouldBe` ""

  describe "Test numberToString" $ do
    it "return correct string" $ do
      numberToString 123 `shouldBe` "123"
      numberToString 999 `shouldBe` "999"
