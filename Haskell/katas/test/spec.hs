module Main where

import Codewars.Functions

import Test.Hspec
import Test.QuickCheck
import Control.Exception (evaluate)

import System.Exit (exitFailure)

main = hspec $ do
  describe "Test Sum of Positive" $ do
    it "sums all numbers where numbers are all positive" $ do
      positiveSum [1,2,3,4] `shouldBe` (10 :: Int)
    it "sums all numbers where numbers are all negative" $ do
      positiveSum [-1,-2,-3,-4] `shouldBe` (0 :: Int)

  describe "Test StringEndsWith" $ do
    it "return true" $ do
      stringEndsWith "abc" "bc" `shouldBe` (True :: Bool)
    it "return false" $ do
      stringEndsWith "abc" "d" `shouldBe` (False :: Bool)

  describe "Test descendingOrder" $ do
    it "returns highest possible number" $ do
      descendingOrder 12345 `shouldBe` 54321
      descendingOrder 432356 `shouldBe` 654332

  describe "Test toDigits" $ do
    it "returns correct list of numbers" $ do
      toDigitList 12345 `shouldBe` [1,2,3,4,5]
      toDigitList 97592 `shouldBe` [9,7,5,9,2]

  describe "Test sortListDesc" $ do
    it "returns correct List of numbers" $ do
      sortNumInList 12345 `shouldBe` [5,4,3,2,1]
      sortNumInList 45821 `shouldBe` [8,5,4,2,1]

  describe "Test foldNumList" $ do
    it "returns concatenated nums of list" $ do
      foldNumList [1,2,3,4,5] `shouldBe` 12345
      foldNumList [5,2,9,9,3] `shouldBe` 52993

