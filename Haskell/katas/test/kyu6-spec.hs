module Main where

import Codewars.Kyu6

import Test.Hspec
import Test.QuickCheck
import Control.Exception (evaluate)

import System.Exit (exitFailure)

main = hspec $ do
  describe "Test spinWords" $ do
    it "returns correct string" $ do
      spinWords "Hey fellow warriors" `shouldBe` "Hey wollef sroirraw"
      spinWords "This is a test" `shouldBe` "This is a test"
      spinWords "This is another test" `shouldBe` "This is rehtona test"

  describe "Test difference" $ do
    it "returns correct list" $ do
      difference [1,2] [1] `shouldBe` [2]
      difference [1,2,2,2,3] [2] `shouldBe` [1,3]
      difference [1,2,2,3] [2] `shouldBe` [1,3]

  describe "Test findOutlier" $ do
    it "returns outlier" $ do
      findOutlier [2, 4, 0, 100, 4, 11, 2602, 36] `shouldBe` 11
      findOutlier [160, 3, 1719, 19, 11, 13, -21] `shouldBe` 160
      findOutlier [2,6,8,-10,3] `shouldBe` 3
      findOutlier [206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781] `shouldBe` 206847684
      findOutlier [2147483647,0,1] `shouldBe` 0