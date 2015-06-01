package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store x87 FPU Status Word
// Category: general/control

trait FSTSW extends InstructionDefinition {
  val mnemonic = "FSTSW"
}

object FSTSW extends ZeroOperands[FSTSW] with OneOperand[FSTSW] with FSTSWImpl

trait FSTSWImpl extends FSTSW {
  implicit object FSTSW_0 extends _1[m16] {
    val opcode: OneOpcode = 0xDD /+ 7
    val format = RmFormat
  }

  implicit object FSTSW_1 extends _0 {
    val opcode: OneOpcode = 0xDF /+ 4
        override def hasImplicitOperand = true
  }
}
