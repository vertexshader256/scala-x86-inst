package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Halt
// Category: general

trait HLT extends InstructionDefinition {
  val mnemonic = "HLT"
}

object HLT extends ZeroOperands[HLT] with HLTImpl

trait HLTImpl extends HLT {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xF4
      }
}
