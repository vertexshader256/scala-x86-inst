package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: IEEE Partial Remainder
// Category: general/arith

trait FPREM1 extends InstructionDefinition {
  val mnemonic = "FPREM1"
}

object FPREM1 extends ZeroOperands[FPREM1] with FPREM1Impl

trait FPREM1Impl extends FPREM1 {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0xD9 /+ 6
        override def hasImplicitOperand = true
  }
}
