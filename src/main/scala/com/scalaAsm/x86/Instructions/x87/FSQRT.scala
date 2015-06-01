package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Square Root
// Category: general/arith

trait FSQRT extends InstructionDefinition {
  val mnemonic = "FSQRT"
}

object FSQRT extends ZeroOperands[FSQRT] with FSQRTImpl

trait FSQRTImpl extends FSQRT {
  implicit object FSQRT_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 7
        override def hasImplicitOperand = true
  }
}
