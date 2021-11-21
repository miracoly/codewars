module Main where

import Codewars.Kyu7

import Test.Hspec
import Test.QuickCheck
import Control.Exception (evaluate)

import System.Exit (exitFailure)

main = hspec $ do
  describe "Test getCount" $ do
    it "returns correct count" $ do
      getCount "Vowel" `shouldBe` 2
      getCount "Hello, you fool" `shouldBe` 6

  describe "Test squareDigit" $ do
    it "returns correct number" $ do
      squareDigit 9119 `shouldBe` 811181

  describe "Test highAndLow" $ do
    it "returns correct string" $ do
      highAndLow "1 2 3 4 5" `shouldBe` "5 1"
      highAndLow "1 2 -3 4 5" `shouldBe` "5 -3"

  describe "Test xs" $ do
    it "returns True" $ do
      xo "ooxx" `shouldBe` True
      xo "OoxXm" `shouldBe` True
    it "returns False" $ do
      xo "oOoxx" `shouldBe` False
      xo "OXoxXm" `shouldBe` False

  describe "Test toJadenCase" $ do
    it "returns all Caspitalized" $ do
      toJadenCase "How can mirrors be real if our eyes aren't real" `shouldBe`
        "How Can Mirrors Be Real If Our Eyes Aren't Real"
