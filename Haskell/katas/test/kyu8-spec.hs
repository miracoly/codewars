module Main where

import Codewars.Kyu8

import Test.Hspec
import Test.QuickCheck
import Control.Exception (evaluate)

import System.Exit (exitFailure)

main = hspec $ do
  describe "Test Sum of Positive" $ do
    it "sums all numbers where numbers are all positive" $ do
      reverse [1,2,3,4] `shouldBe` ([4,3,2,1] :: [Int])